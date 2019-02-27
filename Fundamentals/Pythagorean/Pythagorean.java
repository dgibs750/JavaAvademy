import java.lang.Math;

public class Pythagorean {
    public String calculateHypotenuse(int legA, int legB) {
        double legC = Math.sqrt(legA * legA + legB * legB);
        return "Leg C = " + legC;
    }
}