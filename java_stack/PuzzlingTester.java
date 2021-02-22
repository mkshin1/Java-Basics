import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzlingTester {
  public static void main(String[] args) {
    Puzzling p = new Puzzling();
    int[] arr1 = {1,2,3,4,5,6,7,8};
    ArrayList list1 = p.arrayExample(arr1);
    System.out.println("The new Array is " + list1);

    String[] array2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    ArrayList list2 = p.arrayExample2(array2);
    System.out.println("names with more than 5 char are: " + list2);
    p.abcArrExample();
    String[] list3 = p.randomStrExample(();
    System.out.println("random string array is: " + Arrays.toString(list3));
    int[] arr3 = p.randomArrExample();
    System.out.println("3 random numbers between 1-8 are: " + Arrays.toString(list3));
    String list3 = p.arrayStrExample();
    System.out.println("random string is: " + res5);
    int[] res4 = p.sortArrExample();
    System.out.println("sorted random numbers between 1-8 are: " + Arrays.toString(res4));

  }
}