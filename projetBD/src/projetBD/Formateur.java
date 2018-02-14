package projetBD;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formateur {
	
	@Id
	@Column(name="FORM_ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@OneToMany(mappedBy="formateur")
	private List<Eleve> eleves;
	public Formateur(int id, String name, List<Eleve> eleves) {
		super();
		this.id = id;
		this.name = name;
		this.eleves = eleves;
	}
	
	
	

}
