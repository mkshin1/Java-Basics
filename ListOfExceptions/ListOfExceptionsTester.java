public class ListOfExceptionsTester {
  public static void main(String[] args){
    ListOfExceptions t = new ListOfExceptions();
    try{
      t.combinedArrList();
      System.out.println("this is the number");
    } catch (ClassCastException exception){
        System.out.println("number does not exist");
    }
    }
}