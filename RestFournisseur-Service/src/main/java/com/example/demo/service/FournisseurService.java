package com.example.demo.service;



import java.util.Optional;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Article;
import com.example.demo.entity.ArticleVenteFlash;
import com.example.demo.entity.Categorie;

import com.example.demo.entity.Fournisseur;
import com.example.demo.entity.ImageModel;
import com.example.demo.entity.Marque;
import com.example.demo.entity.SousCategorie;
import com.example.demo.entity.VenteFlash;

import feign.Param;





@FeignClient(name = "CrudApplication" )
public interface FournisseurService {
	

	
	// Article
	
	@GetMapping("/article/{id}")
	public Article getArticleById(@PathVariable("id") String id);
	
	@GetMapping("/article")
	public CollectionModel <Article> findAllArticle(); 
	
	@PostMapping("/article")
	public Article addArticle (@RequestBody Article article);	
	
	@PutMapping("/article/{id}")
	public Article  updatArticle (@RequestBody Article article , @PathVariable("id") String id);
	
	@DeleteMapping("/article/{id}")
	public Optional<Article>  deleteArticle (@PathVariable("id") String id);
	
	
	// Marque 
	
	@PostMapping("/marque")
	public Marque addMarque (@RequestBody Marque marque);
	
	@GetMapping ("/marque")
	public CollectionModel<Marque> findAllMarque ();
	
	@GetMapping ("/marque/{id}")
	public Marque findMarqueById(@PathVariable ("id") String id );
	
	@PutMapping("marque/{id}")
	public Marque updateMarque (@RequestBody Marque marque ,@PathVariable ("id") String id ); 
	
	@DeleteMapping ("/marque/{id}")
	public void deleteMarque (@PathVariable ("id") String id);
	
	
	// Sous_Cathegorie
	
	@PostMapping("/souscategorie")
	public SousCategorie addSousCategorie (@RequestBody SousCategorie sousCategorie);
	
	@GetMapping ("/souscategorie")
	public CollectionModel<SousCategorie> findAllSousCategorie ();
	
	@GetMapping ("/souscategorie/{id}")
	public SousCategorie findSousCategorieById(@PathVariable ("id") String id );
	
	@PutMapping("souscategorie/{id}")
	public SousCategorie updateSousCategorie (@RequestBody SousCategorie marque ,@PathVariable ("id") String id ); 
	
	@DeleteMapping ("/souscategorie/{id}")
	public void deleteSousCategorie (@PathVariable ("id") String id);
	
	
	// Categorie 
	
	@PostMapping("/categorie")
	public Categorie addCategorie (@RequestBody Categorie categorie);
	
	@GetMapping ("/categorie")
	public CollectionModel<Categorie> findAllCategorie ();
	
	@GetMapping ("/categorie/{id}")
	public Categorie findCategorieById(@PathVariable ("id") String id );
	
	@PutMapping("categorie/{id}")
	public Categorie updateCategorie (@RequestBody Categorie categorie ,@PathVariable ("id") String id ); 
	
	@DeleteMapping ("/categorie/{id}")
	public void deleteCategorie (@PathVariable ("id") String id);
	
	// Fournisseur 
	
	@GetMapping ("/fournisseur/{id}")
	public Fournisseur findFournisseurById (@PathVariable ("id") String id);
	
	@PutMapping ("/fournisseur/{id}")
	public Fournisseur updateFournisseur (@RequestBody Fournisseur fournisseur , @PathVariable ("id") String id );
	
	
	// Etat Article Vente Flash 
	
	
	/*@GetMapping ("/etatventeflash/{id}")
	public EtatArticleVenteFlash findEtatArticleVenteFlashById(@PathVariable ("id") String id );
	
	@PostMapping("/etatarticleventeflash")
	public EtatArticleVenteFlash addEtatArticleVenteFlash (@RequestBody EtatArticleVenteFlash etatArticleVenteFlash);
	*/
	
	// Vente Flash 
	
	
	@GetMapping ("/venteflash")
	public CollectionModel<VenteFlash> findAllVenteFlash ();
	
	@GetMapping ("/venteflash/{id}")
	public VenteFlash findVenteFlashById(@PathVariable ("id") String id );
	
	@PostMapping("/venteflash")
	public VenteFlash addVenteFlash (@RequestBody VenteFlash venteFlash);
	
	@DeleteMapping("/venteflash/{id}")
	public void deleteVenteFlash (@PathVariable ("id") String id);
	
	@PostMapping("/articleventeflash")
	public ArticleVenteFlash addArticleVenteFlash(ArticleVenteFlash articleVenteFlash);
		
	
	// image 
	@GetMapping("/image/{id}")
	public ImageModel findImageById(@PathVariable("id") String id );
	
	@PostMapping("/image")
	public BodyBuilder addImage ( @RequestParam("imageFile") MultipartFile file);
	
	
	
	
	
	
}
