public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("2Project");
        Project p3 = new Project("3Project", "this is the 3rd description");

        p1.setName("1Project");
        p1.setDescription("1Project description");
        p1.setInitialCost(200);

        p2.setDescription("2Project description");
        p2.setInitialCost(300);

        p3.setInitialCost(400);

        p1.getElavatorPitch();
        p2.getElavatorPitch();
        p3.getElavatorPitch();
    }
}