import java.util.Random;
public class Die {

    private final int MIN_SIDES = 4;
    private int sides;
    private int value;

    public Die(int numSides){
        if (numSides < MIN_SIDES)
        {
            throw new IllegalArgumentException(
                    "Die must have " + MIN_SIDES + " sides"
            );
        }
        sides = numSides;
        roll();
    }
    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }
    public int getSides(){
        return sides;
    }
    public int getValue(){
        return value;
    }
}
