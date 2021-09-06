public class ProjectTest {

	public static void main(String[] args) {
		Project project = new Project();
		String name = project.getName();
		String description = project.getDescription();
		System.out.println(project.elevatorPitch("Project with default name and description: " + name, description));

		Project project1 = new Project("0001");
		String name1 = project1.getName();
		String description1 = project1.getDescription();
		System.out.println(project.elevatorPitch("Project1 with only name : " + name1, description1));

		Project project2 = new Project("005", "operation1");
		System.out.println("project2 with name is : " + project2.getName() + "\n" + "project2 with description is : "
				+ project2.getDescription());
		project2.setName("Red Dragon");
		project2.setDescription("Lord of the rings");
		System.out.println("Project2 new name : " + project2.getName() + " \nproject2 new Description : "
				+ project2.getDescription());
	}

}
