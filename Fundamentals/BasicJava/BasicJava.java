import java.util.ArrayList;


public class BasicJava {
    String newLine = System.getProperty("line.separator");
    //Print 1-255
    public int[] allNums() {
        int[] numArr = new int[255];
        for(int i = 0; i < 255; i++) {
            numArr[i] = i +  1;
        }
        return numArr;
    }
    //Print odd numbers between 1-255
    public Integer oddNums() {
        //ArrayList<Integer> oddNumArr = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i+=2) {
            System.out.println(i);
        }
        return null;
    }
    //Print Sum
    public Integer printSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.printf("New number: %d Sum: %d"+newLine, i, sum);
        }
        return null;
    }
    //Iterating through an array
    public Integer iterateArray(int[] arr) {
        int count = 0;
        while (count < arr.length) {
            System.out.println(arr[count]);
            count++;
        }
        return null;
    }
    //Find Max
    public Integer findMax(int[] arr) {
        int max = arr[0];
        for(Integer idx : arr) {
            if(max < idx) {
                max = idx;
            }
        }
        System.out.printf("Max is: %d"+newLine, max);
        return null;
    }
    //Get Average
    public Integer getAverage(int[] arr) {
        int avg = 0;
        for(Integer idx : arr) {
            avg += idx;
        }
        avg = avg / arr.length;
        System.out.printf("Average = %d"+newLine, avg);
        return null;
    }
    //Array with Odd Numbers
    public int[] oddArr(int max) {
        int[] arr;
        int count = 1;
        arr = new int[max / 2 + 1];
        for(int i = 0; i < max / 2 + 1; i ++) {
            arr[i] = count;
            count += 2;
            System.out.println(arr[i]);
        }
        System.out.println();
        return arr;
    }
    //Geater Than Y
    public Integer greaterThanY(int[] arr, int y) {
        int count = 0;
        for(Integer idx : arr) {
            if(idx > y) {
                count ++;
            }
        }
        System.out.println(count);
        System.out.println();
        return null;
    }
    //Square the values
    public int[] squareVals(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    //Eliminate Negative Numbers
    public int[] noNegs(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }
    //Max, Min, and Average
    public int[] maxMinAvg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            sum = sum + arr[i];
        }
        int[] newArr = {max, min, sum/arr.length};
        return newArr;
    }
    //Shifting the Values in the Array
    public int[] shiftArr(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}