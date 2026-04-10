import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Produit } from '../model/produit.model';
import { ProduitService } from '../services/produit';
@Component({
  selector: 'app-produits',
  imports: [CommonModule],
  templateUrl: './produits.html',
  styleUrl: './produits.css',
})
export class Produits {
  produits: Produit[]; //un tableau de Produit
  constructor(private produitService: ProduitService) {
    this.produits = produitService.listeProduits();
  }
}
