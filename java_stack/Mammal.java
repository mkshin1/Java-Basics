class Mammal{
    public int enegry = 100;
    public void displayEnegry() {
        System.out.println("My enegry level is" + enegry);
        return "My enegry level is" + enegry;
    }
  
class Gorilla extends Mammal {
    public void throw(){
        energy = enegry - 5;
        System.out.println("Threw banana && lost -5 enegry" " "+ "current enegry level is" +  enegry);
    }
    public void eatBanana(){
        energy = enegry + 10;
        System.out.println("Regained my enegry by 10!" + " " + "current enegry level is" + enegry);
    }
    public void climb(){
        enegry = enegry - 10;
        System.out.println("Climbing - lost my enegry by 10!" + " " + "current enegry level is" + enegry);


    }
}

public class MammalTester(){
    public static void main(String[] args){
        Gorilla newMammal = new Gorilla();
        System.out.println(newMammal.throw());

    }
}
