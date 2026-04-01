package com.lotfi.produit.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lotfi.produit.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
