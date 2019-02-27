import java.util.ArrayList;


public class BasicJava {
    //Print 1-255
    public int[] allNums() {
        int[] numArr = new int[255];
        for(int i = 0; i < 255; i++) {
            numArr[i] = i +  1;
        }
        return numArr;
    }
    //Print odd numbers between 1-255
    public ArrayList<Integer> oddNums() {
        ArrayList<Integer> oddNumArr = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i+=2) {
            oddNumArr.add(i);
        }
        return oddNumArr;
    }
}