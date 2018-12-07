public class Ingredient implements Composant {
    private double prix;
    private String nom;
    public Ingredient(double prix,String nom){
        this.prix=prix;
        this.nom=nom;
    }
    @Override
    public double getPrix(){
        return this.prix;
    }
    @Override
    public String getNom(){
        return this.nom;
    }
}
