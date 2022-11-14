package demo_WSSOAP;

public class Absence {
	
	int nb_absence;
	Matiere matiere;
	Etudiant etudiant;
	int seance;
	public int getSeance() {
		return seance;
	}
	public void setSeance(int seance) {
		this.seance = seance;
	}
	public int getNb_absence() {
		return nb_absence;
	}
	public void setNb_absence(int nb_absence) {
		this.nb_absence = nb_absence;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public int ajouterAbsence() {
		nb_absence++;
		return nb_absence;
	}
}
