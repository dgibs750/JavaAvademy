public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        char letter = 'o';
        System.out.println(manipulator.trimAndConcat("    Hello    ","    World    "));

        System.out.println();
        
        System.out.println(manipulator.getIndexOrNull("Coding", letter));
        System.out.println(manipulator.getIndexOrNull("Hello World", letter));
        System.out.println(manipulator.getIndexOrNull("Hi", letter));
        
        System.out.println();
        
        System.out.println(manipulator.getIndexOrNull("Hello", "llo"));
        System.out.println(manipulator.getIndexOrNull("Hello", "world"));

        System.out.println();

        System.out.println(manipulator.concatSubstring("Hello", 1, 2, "world"));
    }
}