package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Article {
	

	
	private String id;        
	private String mat;

	private String designtationArt;
	private String descriptionArt;
	private  double prixArt;
	private int qteStockArt;
	private double tauxRemiseArt;

	private Marque marqueArt;

	private SousCategorie sousCategorieArt;

	private Fournisseur fournisseurArt;
	
	private String imageName ;
//	private ImageModel imageModel ;
	
	public String getId( ) {
        return this.mat;
    }
	

}