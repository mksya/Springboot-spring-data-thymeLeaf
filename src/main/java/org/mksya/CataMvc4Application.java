package org.mksya;

import org.mksya.dao.ProduitRepository;
import org.mksya.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CataMvc4Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CataMvc4Application.class, args);
		ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("Stockfish", 10000,10));
		produitRepository.save(new Produit("Shyrka", 500,10));
		produitRepository.save(new Produit("Alpha Zero",20000,5));
		produitRepository.save(new Produit("The Matrix", 500000,1));
		
		produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
	}

}
