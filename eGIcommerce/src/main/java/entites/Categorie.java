package entites;
 import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
 @Entity
 public class Categorie implements Serializable {
	 @Id @GeneratedValue private Long idCategorie;
	 @NotEmpty 
	 @Size(min=4,max=20) 
	 private String nomCategorie;
	 private String description;
	 private String nomPhoto;
	 @Lob
	 private byte[] photo;
	 @OneToMany(mappedBy="categorie")
	 private Collection<Produit> produits=new ArrayList<Produit>(); 
	
 }