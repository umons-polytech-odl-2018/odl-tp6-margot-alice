public class Carbonara extends Pizza{
        public Carbonara(){
            super("Carbonara");
            Pate pate = new Pate();
            this.AddIngredient(pate);
            Creme_blanche creme_blanche = new Creme_blanche();
            this.AddIngredient(creme_blanche);
            Fromage fromage = new Fromage();
            this.AddIngredient(fromage);
            Jambon jambon = new Jambon();
            this.AddIngredient(jambon);
        }
    }

