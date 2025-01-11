package metier;

public class Produit {

    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nbStock;

    public Produit() {
    }

    public Produit(long id, String nom, String marque, double prix, String description, int nbStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbStock = nbStock;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public int getNbStock() {
        return nbStock;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }
}

