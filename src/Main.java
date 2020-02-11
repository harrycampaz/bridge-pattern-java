public class Main {

    public static void main(String[] args) {

        AbstractSandwich openSandwich = new Sandwich("Jamon", "Queso", new OpenSandwich());
        openSandwich.make();


        AbstractSandwich closeSandwich = new Sandwich("Jamon", "Quedo",new  ClosedSandwich());
        closeSandwich.make();

    }
}
