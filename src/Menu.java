import java.util.Scanner;

public class Menu {

	private static Produit prod1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sys = true; 
		MitierProduitImpl listProduit = new MitierProduitImpl("produit.txt");
		listProduit.getAll();
		System.out.println("Bienvenu !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("1 -- Afficher List des produit");
		System.out.println("2 -- Chercher produit par ID");
		System.out.println("3 -- Ajouter produit");
		System.out.println("4 -- Supprimer produit par ID");
		System.out.println("5 -- Enregistrer tout");
		System.out.println("6 -- Quitter");
		while(sys) {
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
			System.out.println("Veuillez saisir un nombre :");
			int str = sc.nextInt();
			switch (str) {
			case 1:
				
				System.out.println("List des produit");
				for (Produit produit : listProduit.getListProduits()) {
					System.out.println(produit.toString());
					System.out.println("*************************");
				}
				break;
			case 2:
				System.out.println("2-- Chercher par ID");
				System.out.println("-- Donner id produit --");
				prod1 = listProduit.findById(sc.nextLong());
				if(prod1 == null) {
					System.out.println("Produit n\'existe pas");
				}else {
					System.out.println(prod1.toString());
				}
				break;
			case 3:
				
				System.out.println("-- Ajouter produit --");
				Produit prod = new Produit();
				boolean sys2 = true;
				while(sys2) {
					System.out.println("-- Donner id produit --");
					Long id = sc.nextLong();
					if(listProduit.findById(id) == null) {
						prod.setId(id);
						System.out.println("-- Donner nom --");
						prod.setNom(sc.next());
						sc.nextLine();
						System.out.println("-- Donner Marque --");
						prod.setMarque(sc.next());
						System.out.println("-- Donner prix --");
						prod.setPrix(sc.nextFloat());
						System.out.println("-- Donner dsecription --");
						prod.setDescription(sc.next());
						System.out.println("-- Donner qte en stock --");
						prod.setQteStock(sc.nextLong());
						listProduit.add(prod);
						sys2 = false;
					}else {
						System.out.println("-- id produit existe deja --");
					}
				}
				
				break;
			case 4:
				System.out.println("3-- Supprimer par ID");
				System.out.println("-- Donner id produit --");
				Long id = sc.nextLong();
				prod1 = listProduit.findById(id);
				if(prod1 == null) {
					System.out.println("Produit n\'existe pas");
				}else {
					listProduit.delete(id);
				}
				break;
			case 5:
				System.out.println("3-- Enregistrer tout");
				listProduit.saveAll();
				break;
			case 6:
				sys=false;
				System.out.println("Au revoire");
				break;

			default:
				System.out.println("N'existe pas");
				break;
			}
		}
		

	}

}
