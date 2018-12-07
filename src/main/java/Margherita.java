public class Margherita extends Pizza{

        public Margherita(){
            super("Margherita");
            Pate pate = new Pate();
            this.AddIngredient(pate);
            Sauce_tomate sauce_tomate = new Sauce_tomate();
            this.AddIngredient(sauce_tomate);
            Fromage fromage = new Fromage();
            this.AddIngredient(fromage);
        }
    }


