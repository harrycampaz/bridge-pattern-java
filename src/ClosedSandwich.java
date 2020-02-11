public class ClosedSandwich implements SandwichInterface {
    @Override
    public void makeSandwich(String filling1, String filling2) {
        System.out.println("Close makeSandwich: " + filling1 + " " + filling2);
    }
}
