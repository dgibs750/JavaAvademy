//import JAVA

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] myArr = {1,2,3,4,5};
        String[] myArr2 = {"Dorian", "Priscilla", "John"};

        for(int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        for(String name : myArr2) {
            System.out.println("Each name: " + name);
            //System.out.println(name);
        }
    }
}