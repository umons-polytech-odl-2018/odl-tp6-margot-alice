public class Prosciutto extends Pizza{
    public Prosciutto(){
        super("Prosciutto");
        Pate pate = new Pate();
        this.AddIngredient(pate);
        Sauce_tomate sauce_tomate = new Sauce_tomate();
        this.AddIngredient(sauce_tomate);
        Fromage fromage = new Fromage();
        this.AddIngredient(fromage);
        Jambon jambon = new Jambon();
        this.AddIngredient(jambon);
    }
}
