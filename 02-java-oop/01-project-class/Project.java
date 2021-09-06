public class Project {
    private String name;
    private String description;
    private double initialCost = 0;

    public Project() {
        this.name = "I am a deault constructor with no name";
        this.description = "I am a deault constructor with no description";
    }

    public Project(String name) {
        this.name = name;
        this.description = "I have default description";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String elevatorPitch(String name, double initialCost, String description) {
        return String.format("%s (%02f) %s", name, initialCost, description);
    }

    public String elevatorPitch(String name, String description) {
        return String.format("%s %s", name, description);
    }

}
