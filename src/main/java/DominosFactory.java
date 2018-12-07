public class DominosFactory implements AbstractFactory {
    private static DominosFactory dominosfactory = null;

    public DominosFactory getDominosFactory(){
        if(dominosfactory==null){
            dominosfactory = new DominosFactory();
        }
        return dominosfactory;
    }

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
