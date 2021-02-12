public class oopSample {
    public String greet(String name){
        return "Hello " + name;
    }
    public String greet(){
        return "Hello World";
    }
    private String createGreeting(String tobeGreeted){
        return "greeting" + tobeGreeted + "welcome to coding dojo!";

    }
    public String greet(String firstName, String lastName){
        System.out.println("We are about to greet" + firstName);
        return createGreeting(firstName + lastName);
    }
}