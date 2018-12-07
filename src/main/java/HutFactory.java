public class HutFactory implements AbstractFactory {


    @Override
    public Pizza CreatePizza (String nom){
        switch(nom){
            case "Margherita":
                return new Margherita_Hut();
            case "Prosciutto":
                return new Prosciutto_Hut();
            case "Frutti di mare":
                return new Frutti_di_mare_Hut();
            case "Carbonara":
                return new Carbonara_Hut();
            default:
                return null;
        }
    }
}
