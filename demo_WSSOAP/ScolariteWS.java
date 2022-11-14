package demo_WSSOAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(name="ScolariteWS")

public class ScolariteWS {
	List<Absence> absences = new ArrayList<Absence>();
	@WebMethod
	public int addition( @WebParam( name="op1")int operande1, @WebParam( name="op2") int operande2) {
		return operande1+operande2;
	}

	@WebMethod
	public int ajouterAbsence( @WebParam( name="e")Etudiant e,@WebParam( name="seance")int seance,@WebParam( name="matiere")String matiere) {
		Absence absence=new Absence();
		absence.setEtudiant(e);
		Matiere me=new Matiere();
		me.setNomMatiere(matiere);
		absence.setMatiere(me);
		absence.setSeance(seance);
		absence.ajouterAbsence();
		absences.add(absence);
		return absence.getNb_absence();
	}
	@WebMethod
	public int consulterAbsence( @WebParam( name="numInscription")String numInscription) {
		for (int i = 0; i < absences.size(); i++) {
			if (absences.get(i).getEtudiant().getNumInscription().equals(numInscription)) {
				System.out.println("etudiant num "+numInscription+" ====> nb absence" +absences.get(i).getNb_absence());
				return absences.get(i).getNb_absence();
			}
			
		}
		return 0;
	}



}
