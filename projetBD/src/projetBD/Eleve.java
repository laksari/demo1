package projetBD;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Eleve {
	
	@Id
	@Column(name="ELEV_ID")
	private int id;
	@Column(name="NAME")
	private String name;
	
	@ManyToOne
	private Formateur formateur;

	public Eleve(int id, String name, Formateur formateur) {
		super();
		this.id = id;
		this.name = name;
		this.formateur = formateur;
	}
	
	

}
