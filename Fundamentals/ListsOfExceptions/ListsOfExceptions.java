import java.util.ArrayList;

public class ListsOfExceptions {
    public Integer listsExcep() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        try{
            for(int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
            }
            System.out.println("Success");
        } catch(Exception e) {
            System.out.println("There was a Class Cast Exemption");
        }
        return null;
    }
}