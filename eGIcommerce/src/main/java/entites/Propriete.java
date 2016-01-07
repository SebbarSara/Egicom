package entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Propriete {
	
	@Id
	@GeneratedValue
	@Column
	int id_prop;
	
	@Column
	private String lib_prop;
	
	@Column
	private String valeur_prop;
	
	@ManyToMany(mappedBy="proprietes")
	private List<Produit> produits;
	public Propriete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Propriete(String lib_prop, String valeur_prop) {
		super();
		this.lib_prop = lib_prop;
		this.valeur_prop = valeur_prop;
	}
	public int getId_prop() {
		return id_prop;
	}
	
	public String getLib_prop() {
		return lib_prop;
	}
	public void setLib_prop(String lib_prop) {
		this.lib_prop = lib_prop;
	}
	public String getValeur_prop() {
		return valeur_prop;
	}
	public void setValeur_prop(String valeur_prop) {
		this.valeur_prop = valeur_prop;
	}
	
	

}
