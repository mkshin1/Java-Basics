import java.util.ArrayList;

public class ListOfExceptions {
  public void combinedArrList() {
    ArrayList<Object> List = new ArrayList<Object>();
    List.add("1");
    List.add("bang bang");
    List.add(2);
    List.add("no bang");
    for (int i = 0; i < List.size(); i++) {
      Integer number = (Integer) List.get(i);
      System.out.println("number is " + number);
      if (number == 0 && List.get(i) != "0") {
        throw new ClassCastException();
      }
    }
  }
}