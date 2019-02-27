public class AboutMe {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator"); // This will retrieve line seperator dependant on OS.

        System.out.printf("My name is Dorian Gibson" +newLine+ "I am %d years old"+newLine+"My hometown is Bethesda, Maryland"+newLine, 24);
    }
}