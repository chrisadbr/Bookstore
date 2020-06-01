public class DieMain {

    public static void main(String[] args) {
        Die die = new Die(6);
        System.out.println("Sides: " + die.getSides());
        System.out.println("Rolled: " + die.getValue());
    }
}
