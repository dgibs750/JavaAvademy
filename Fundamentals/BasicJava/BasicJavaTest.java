import java.util.ArrayList;


public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava tests = new BasicJava();

        //Print 1-255
        int[] numArr = tests.allNums();
        for(int num : numArr) {
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println();
        //Print odd 1-255
        ArrayList<Integer> oddArr = tests.oddNums();
        for(int num : oddArr) {
            System.out.print(num + ",");
        }
    }
}