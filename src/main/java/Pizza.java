import java.util.ArrayList;


public abstract class Pizza implements Composant {
    String nom;
    ArrayList<Ingredient> ingredients;
    public Pizza(String nom){
        this.nom = nom;
        ingredients = new ArrayList<>();
    }
    public void AddIngredient(Ingredient ingredient){
        this.ingredients.add(ingredient);
    }
    public void removeIngredient(Ingredient ingredient){
        this.ingredients.remove(ingredient);
    }

    @Override
    public double getPrix(){
        double prix = 0;
        for(Ingredient ingredient : ingredients){
            prix=prix+ ingredient.getPrix();
        }
        return prix;
    }
    public String getNom(){
        return this.nom;
    }
}


