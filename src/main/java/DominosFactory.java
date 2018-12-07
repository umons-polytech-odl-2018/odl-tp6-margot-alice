public class DominosFactory implements AbstractFactory {
    

    @Override
    public Pizza CreatePizza (String nom){
        switch(nom){
            case "Margherita":
                return new Margherita();
            case "Prosciutto":
                return new Prosciutto();
            case "Frutti di mare":
                return new Frutti_di_mare();
            case "Carbonara":
                return new Carbonara();
            default:
                return null;
        }
    }
}
