package org.mksya.web;

import java.util.List;

import org.mksya.dao.ProduitRepository;
import org.mksya.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepository;
	@RequestMapping(value="/index")
	public String index(Model model) {
		List<Produit> produits=produitRepository.findAll();
		model.addAttribute("listProduits",produits);
		return "produits";
	}

}
