import java.util.ArrayList;


public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava tests = new BasicJava();

        //Print 1-255
        int[] numArr = tests.allNums();
        for(int num : numArr) {
            System.out.print(num + ", ");
        }

        //Print odd 1-255
        tests.oddNums();

        //Print Sum
        tests.printSum();

        //Iterate through an array
        int[] newArr = {1,3,5,7,9,13};
        tests.iterateArray(newArr);

        //Find Max
        int[] maxArr = {1,-3,5,0,9,-13};
        tests.findMax(maxArr);
        
        //Get Average
        int[] avgArr = {2,10,3};
        tests.getAverage(avgArr);

        //Array with Odd Numbers
        tests.oddArr(255);

        //Greater Than Y
        tests.greaterThanY(maxArr, 4);

        //Square the values
        int[] squaredArr = tests.squareVals(avgArr); // [2,10,3]
        for(Integer idx : squaredArr) {
            System.out.println(idx);
        }
        System.out.println();

        //Eliminate Negative Nummbers
        int[] noMoreNegs = tests.noNegs(maxArr); //[1,-3,5,0,9,-13]
        for(Integer idx : noMoreNegs) {
            System.out.println(idx);
        }
        System.out.println();

        //Max, Min, and Average
        int[] anotherArr = {1,-3,5,0,9,-13};
        int[] maxMinAvgArr = tests.maxMinAvg(anotherArr);
        for(Integer idx : maxMinAvgArr) {
            System.out.println(idx);
        }
        System.out.println();

        //Shifting the Values in the Array
        int[] shiftedArr = tests.shiftArr(anotherArr);
        for(Integer idx : shiftedArr) {
            System.out.println(idx);
        }

    }
}