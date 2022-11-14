package demo_WSSOAP;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {
	
	String numInscription ;
	String name;
	Date dateDeNaissance;
	String tel;
	String mail;
	Double moyenneBac;
	
	public String getNumInscription() {
		return numInscription;
	}
	public void setNumInscription(String numInscription) {
		this.numInscription = numInscription;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Double getMoyenneBac() {
		return moyenneBac;
	}
	public void setMoyenneBac(Double moyenneBac) {
		this.moyenneBac = moyenneBac;
	}
	
}
