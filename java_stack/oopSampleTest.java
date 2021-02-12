public class oopSampleTest {
    public static void main(String[] args){
        oopSample helloWorld = new oopSample();
        String greeting = helloWorld.greet();
        String greetingWithName = helloWorld.greet("Eduardo");
        if (greeting.equals("Hello World") || greetingWithName.equals("Hello Eduardo")){
            System.out.println("Test successful");
        } else{
            System.out.println("Test Fail");
        }
        String greetingWithName2 = helloWorld.greet("mike", "shin");
    }
}