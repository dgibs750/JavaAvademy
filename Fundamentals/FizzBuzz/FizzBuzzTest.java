public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz iD = new FizzBuzz();

        String newLine = System.getProperty("line.separator");

        System.out.printf("Output for 3 : %s"+ newLine, iD.fizzBuzz(3));
        System.out.printf("Output for 5 : %s"+ newLine, iD.fizzBuzz(5));
        System.out.printf("Output for 15 : %s"+ newLine, iD.fizzBuzz(15));
        System.out.printf("Output for 2 : %s"+ newLine, iD.fizzBuzz(2));
    }
}