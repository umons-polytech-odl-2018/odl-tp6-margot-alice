public class Frutti_di_mare extends Pizza {

        public Frutti_di_mare(){
            super("Frutti di mare");
            Pate pate = new Pate();
            this.AddIngredient(pate);
            Sauce_tomate sauce_tomate = new Sauce_tomate();
            this.AddIngredient(sauce_tomate);
            Fromage fromage = new Fromage();
            this.AddIngredient(fromage);
            Fruit_de_mer fruit_de_mer = new Fruit_de_mer();
            this.AddIngredient(fruit_de_mer);
        }
    }

