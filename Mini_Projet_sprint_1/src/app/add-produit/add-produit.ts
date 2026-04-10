import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Produit } from '../model/produit.model';
import { ProduitService } from '../services/produit';

@Component({
  selector: 'app-add-produit',
  imports: [FormsModule],
  templateUrl: './add-produit.html',
  styleUrl: './add-produit.css',
})
export class AddProduit implements OnInit {
  newProduit: Produit = {};
  constructor(private produitService: ProduitService) { }
  ngOnInit(): void {
  }
  addProduit() {
    this.produitService.ajouterProduit(this.newProduit);
  }
}