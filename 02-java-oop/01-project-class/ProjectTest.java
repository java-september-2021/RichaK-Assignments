public class ProjectTest {

	public static void main(String[] args) {
		Project project1 = new Project("0001");
		System.out.println("project1 name is : " + project1.getName());

		Project project2 = new Project("005", "operation1");
		System.out.println(
				"project2 name is : " + project2.getName() + " project2 description is : " + project2.getDescription());

		String newProject = project2.elevatorPitch("003", "james bond");
		System.out.println("new project is : " + newProject);
	}

}