package metier;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl m=new MetierProduitImpl();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("***** Menu *****");
            System.out.println("1. Afficher la liste des Produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un  nouveau produit par son id");
            System.out.println("4. Supprimer un produit par son id");
            System.out.println("5. Quitter ce programme ");

            int choix=sc.nextInt();
            sc.nextLine();

            switch(choix){
                case 1:
                    System.out.println(" La liste des Produits :");
                    for (Produit p:m.getAll()){
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println(" Entrer id du produit à rechercher ");
                    long idRech=sc.nextLong();
                    Produit pRech=m.findbyId(idRech);
                    if(pRech!=null){
                        System.out.println("Produit existe ");
                    }
                    else{
                        System.out.println("Produit n'existe pas");
                    }
                    break;
                case 3:
                    System.out.println("Entrez l'id du produit :");
                    long id=sc.nextLong();
                    sc.nextLine();

                    System.out.println("Entrez le nom du produit :");
                    String name=sc.nextLine();

                    System.out.println("Entrez la marque du produit :");
                    String marque=sc.nextLine();

                    System.out.println("Entrez le prix du produit :");
                    double prix= sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Entrez le description du produit :");
                    String description=sc.nextLine();

                    System.out.println("Entrez le stock du produit :");
                    int stock=sc.nextInt();

                    Produit P=new Produit(id,name,marque,prix,description,stock);
                    m.add(P);
                    System.out.println("Produit ajouter avec succes");
                    break;

                case 4:
                    System.out.println(" Entez l'id du produit à supprimer ");
                    long idSup=sc.nextLong();
                    Produit idSupR=m.findbyId(idSup);
                    if(idSupR!=null){
                        m.delete(idSup);
                        System.out.println("Produit supprimer avec succes");
                    }
                    else{
                        System.out.println("Produit n'existe pas");
                    }
                    break;


                case 5:
                    System.out.println(" Quitter ce programme ");
                    sc.close();
                    return;
                    default:
                        System.out.println("Choix Invalide!!! reessayer de nouveau");
            }
        }
    }
}
