package metier;

import java.util.*;

public class ProduitModele {
	private String motCle;
	private ICatalogue cat;
	List<Produit> produits = new ArrayList<>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	public ICatalogue getCatalogue() {
		return cat;
	}

	public void setCatalogue(ICatalogue c) {
		cat = c;
	}
	public void loadProduits() {
		produits = cat.getProduitsParMotCle(motCle);
	}
}
