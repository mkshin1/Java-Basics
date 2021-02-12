class ProjectClassTest {
    public static void main(String[] args){
        ProjectClass project1 = new ProjectClass("project1", "test");
        String pitch = project1.elevatorPitch();
        System.out.println(pitch);
        project1.setName("project1.2");
        System.out.println(project1.getName());
        System.out.println(project1.getDesc());

        String pitch2 = project1.elevatorPitch();
        System.out.println(pitch2);
        ProjectClass project2 = new ProjectClass("project1.3");
        String project2Name = project2.getName();
        System.out.println(project2Name);
        System.out.println(project1.getDesc());
        project1.setDesc("project1.4");
        System.out.println(project1.getDesc());



    }
}