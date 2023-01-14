
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MitierProduitImpl listProduit = new MitierProduitImpl("produit.txt");
		Produit prod1 = new Produit(1, "Ordinateur1", "HP", 7500, "RAS", 100);
		Produit prod2 = new Produit(2, "Tele", "OPPO", 7500, "RAS", 100);
		Produit prod3 = new Produit(3, "Ipad", "Appel", 7500, "RAS", 100);
		Produit prod4 = new Produit(4, "Ordinateur2", "DEll", 7500, "RAS", 100);
		//methode Add
		listProduit.add(prod1);
		listProduit.add(prod2);
		listProduit.add(prod3);
		listProduit.add(prod4);
		
		//listProduit.saveAll();
		
		System.out.println("-----------------getAll------------------------");
		
		MitierProduitImpl listProduit2 = new MitierProduitImpl("produit.txt");
		
		for (Produit produit : listProduit2.getAll()) {
			System.out.println(produit.toString());
			System.out.println("*************************");
		}
		
		System.out.println("---------------FIND--------------------------");
		Produit prod = listProduit2.findById(1);
		System.out.println(prod.toString());
		
		System.out.println("-----------------DELETE-----------------------");
		listProduit.delete(2);
		for (Produit produit1 : listProduit2.getAll()) {
			System.out.println(produit1.toString());
			System.out.println("*************************");
		}
	}
}
