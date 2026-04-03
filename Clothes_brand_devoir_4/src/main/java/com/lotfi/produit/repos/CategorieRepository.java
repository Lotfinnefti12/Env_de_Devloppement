package com.lotfi.produit.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lotfi.produit.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>
{
	
}
