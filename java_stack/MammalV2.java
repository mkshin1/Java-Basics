class MammalV2{
    private boolean sleeping = false;
    public void regulateTemperature() {
        System.out.println("My temperature is just right now.");
    }
    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
}

class Human extends MammalV2 {
    
    public void goToWork(){
        System.out.println("I'm going to work, something only humans can do.");
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.regulateTemperature();
        h.startSleeping();
        h.goToWork();
        boolean sleeping = h.isSleeping();
        
        if (sleeping){
            System.out.println("The human is sleeping!");
        }
    }
}