package entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Marque {
	
	@Id
	@GeneratedValue
	@Column
	private int id_marque;
	
	@Column
	private String lib_marque;
	
	@OneToMany(mappedBy = "marque")
	List<Produit> produit;
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marque(String lib_marque) {
		super();
		this.lib_marque = lib_marque;
	}
	public int getId_marque() {
		return id_marque;
	}

	public String getLib_marque() {
		return lib_marque;
	}
	public void setLib_marque(String lib_marque) {
		this.lib_marque = lib_marque;
	}
	
	

}


