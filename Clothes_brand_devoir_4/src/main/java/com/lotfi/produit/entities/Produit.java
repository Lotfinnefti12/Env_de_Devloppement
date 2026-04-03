package com.lotfi.produit.entities;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import com.lotfi.produit.entities.Categorie;


@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	@NotNull
	@Size (min = 4,max = 15)
	private String nomProduit;
	
	@NotNull
	@Min(value = 10)
	@Max(value = 10000)
	private Double prixProduit;

	@SuppressWarnings("deprecation")
	private Date dateCreation;	
	
	@ManyToOne
	private Categorie categorie;
	


	
	
	public Produit() {
		super();
	}
public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
super();
this.nomProduit = nomProduit;
this.prixProduit = prixProduit;
this.dateCreation = dateCreation;
}
public Long getIdProduit() {
return idProduit;
}
public void setIdProduit(Long idProduit) {
this.idProduit = idProduit;
}
public String getNomProduit() {
return nomProduit;
}
public void setNomProduit(String nomProduit) {
this.nomProduit = nomProduit;
}
public Double getPrixProduit() {
return prixProduit;
}
public void setPrixProduit(Double prixProduit) {
this.prixProduit = prixProduit;
}
public Date getDateCreation() {
return dateCreation;
}
public void setDateCreation(Date dateCreation) {
this.dateCreation = dateCreation;
}

@Override
public String toString() {
return "Produit [idProduit=" + idProduit + ", nomProduit=" +
nomProduit + ", prixProduit=" + prixProduit
+ ", dateCreation=" + dateCreation + "]";
}
}
