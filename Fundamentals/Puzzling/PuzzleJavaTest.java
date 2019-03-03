public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzles = new PuzzleJava();

        //Puzzle 1
        System.out.println(puzzles.greaterThanTen());

        //Puzzle 2
        System.out.println(puzzles.longNames());

        //Puzzle 3
        puzzles.alphabet();

        //Puzzle 4
        puzzles.randomArray();

        //Puzzle 5
        puzzles.sortedRandArray();

        //Puzzle 6
        System.out.println(puzzles.randomString());

        //Puzzle 7
        puzzles.randomStringArray();
    }
}