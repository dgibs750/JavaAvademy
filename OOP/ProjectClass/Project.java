public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {
    }
    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getInitialCost() {
        return initialCost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }
    
    private String setElavatorPitch() {
        String pitch = this.name + " ("+ Double.toString(this.initialCost) + "): "+ this.description;
        return pitch;
    }

    public void getElavatorPitch() {
        String pitch = this.setElavatorPitch();
        System.out.println(pitch);
        System.out.println();
    }

}