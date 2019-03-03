import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    Random rand = new Random();

    //Puzzle 1
    public ArrayList<Integer> greaterThanTen() {
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> overTen = new ArrayList<Integer>();
        int sum = 0;
        for(Integer idx : arr) {
            sum += idx;
            if(idx > 10) {
                overTen.add(idx);
            }
        }
        System.out.println("Sum : "+  sum);
        return overTen;
    }

    //Puzzle 2
    public ArrayList<String> longNames() {
        String[] nameArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(nameArr));
        ArrayList<String> namesWithFive = new ArrayList<String>();
        Collections.shuffle(names);
        for(String name : names) {
            System.out.println(name);
            if(name.length() > 5) {
                namesWithFive.add(name);
            }
        }
        return namesWithFive;
    }

    //Puzzle 3
    public String alphabet() {
        String[] abcArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> abcList = new ArrayList<String>(Arrays.asList(abcArr));
        Collections.shuffle(abcList);
        System.out.println(abcList.get(25));
        if(abcList.get(0) == "a" || abcList.get(0) == "e" || abcList.get(0) == "i" || abcList.get(0) == "o" || abcList.get(0) == "u") {
            System.out.println("The first letter is a vowel : " + abcList.get(0));
        }else {
            System.out.println(abcList.get(0));
        }
        return null;
    }

    //Puzzle 4
    public int[] randomArray() {
        int[] randArr;
        randArr = new int[10];
        for(int i = 0; i < randArr.length; i++) {
            randArr[i] = rand.nextInt(100 - 55) + 55;
        }
        System.out.println(Arrays.toString(randArr));
        return randArr;
    }

    //Puzzle 5
    public int[] sortedRandArray() {
        int[] sortRandArr;
        sortRandArr = new int[10];
        for(int i = 0; i < sortRandArr.length; i++) {
            sortRandArr[i] = rand.nextInt(100 - 55) + 55;
        }
        Arrays.sort(sortRandArr);
        System.out.println(Arrays.toString(sortRandArr));
        return sortRandArr;
    }

    //Puzzle 6
    public StringBuffer randomString() {
        String alpha = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        StringBuffer randStr = new StringBuffer();
        for(int i = 0; i < 5; i++) {
            randStr.append(alpha.charAt(rand.nextInt(52)));
        }
        return randStr;
    }

    //Puzzle 7
    public String[] randomStringArray() {
        String alpha = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String[] randStrArr = new String[10];
        for(int i = 0; i < randStrArr.length; i++) {
            StringBuffer randStr = new StringBuffer();
            for(int x = 0; x < 5; x++) {
                randStr.append(alpha.charAt(rand.nextInt(52)));
            }
            randStrArr[i] = randStr.toString();
        }
        System.out.println(Arrays.toString(randStrArr));
        return randStrArr;
    }
}
    