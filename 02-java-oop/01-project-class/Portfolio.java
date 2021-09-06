import java.util.ArrayList;

public class Portfolio {

    ArrayList<Project> Projects;

    public Portfolio() {
        this.Projects = new ArrayList<Project>();
    }

    public void addPortfolio(Project p) {
        Projects.add(p);
    }

    public String getPortfoli() {
        return Projects.toString();

    }

    public double getPortfolioCost() {
        double total = 0;
        for (Project p : Projects) {
            total += p.getInitialCost();
        }

        return total;
    }

    public void showPortfolio() {
        System.out.println("All projects in portfolio:");
        for (Project p : Projects) {
            System.out.println(p);
        }
        System.out.println(String.format("Total Cost :  %f " + this.getPortfolioCost()));
    }

}
