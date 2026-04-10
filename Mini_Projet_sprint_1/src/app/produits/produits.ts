import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-produits',
  imports: [CommonModule],
  templateUrl: './produits.html',
  styleUrl: './produits.css',
})
export class Produits {
  produits: string[]; //un tableau de chînes de caractères
  constructor() {
    this.produits = ["T-shirt", "pantalon", "chaussures"];
  }

}
