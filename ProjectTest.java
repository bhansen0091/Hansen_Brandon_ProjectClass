/**
 * ProjectTest
 */
public class ProjectTest {

    public static void main(String[] args) {
        Project p1 = new Project();
        p1.setName("Do Something!");
        p1.setDescription("How to do it!");
        System.out.println(p1.getName());
        System.out.println(p1.getDescription());
        System.out.println(p1.elevatorPitch());

        Project p2 = new Project("Second Thing");
        System.out.println(p2.getName());
    }
}