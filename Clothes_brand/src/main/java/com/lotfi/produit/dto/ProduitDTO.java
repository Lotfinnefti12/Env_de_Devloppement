package com.lotfi.produit.dto;

import java.util.Date;

import com.lotfi.produit.entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDTO {
private Long idProduit;
private String nomProduit;
private Double prixProduit;
private Date dateCreation;
private Categorie categorie;
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
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
}