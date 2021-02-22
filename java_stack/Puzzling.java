import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Puzzling {
  public ArrayList arrayExample(int[] arr) {
    int sum = 0;
    ArrayList<Integer> res = new ArrayList<Integer>();
    for (int n: arr) {
      sum = sum + n;
      if (n > 10) {
        res.add(n);
      }
    }
    System.out.println("sum is " + sum);
    return res;
  }
  public ArrayList arrayExample2(String[] arr) {
    ArrayList<String> res = new ArrayList<String>();
    ArrayList<String> arrayshuffle = new ArrayList<String>();
    for (String name: arr) {
      if (name.length() > 5) {
        res.add(name);
      }
      arrayshuffle.add(name);
    }
    Collections.shuffle(arrayshuffle);
    System.out.println("shuffled names " + arrayshuffle);
    return res;
  }
  public void abcArrExample() {
    char[] alphabet = "abckdfdlf".toCharArray();
    ArrayList<Character> alphabetshuffle = new ArrayList<Character>();
    char[] vowel = "aeiou".toCharArray();
    for (char c: alphabet) {
      alphabetshuffle.add(c);
    }
    Collections.shuffle(alphabetshuffle);
    System.out.println("first letter" + alphabetshuffle.get(0));
    System.out.println("last letter" + alphabetshuffle.get(alphabetshuffle.size()-1));
    for (char v: vowel) {
      if (alphabetshuffle.get(0) == v) {
        System.out.println("first letter " + v + " is a vowel");
      } 
    }
  }
  public int[] randomArrExample() {
    int[] arr;
    arr = new int[10];
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      arr[i] = r.nextInt(45)+55;
    }
    return arr;
  }
  public int[] sortArrExample() {
    ArrayList<Integer> arrlist = new ArrayList<Integer>();
    int[] arr;
    arr = new int[10];
    for (int i = 0; i < 10; i++) {
      Random r = new Random();
      arrlist.add(r.nextInt(45) + 55);
    }
    Collections.sort(arrlist);
    for (int i = 0; i < 10; i++) {
      arr[i] = arrlist.get(i);
    }
    return arr;
  }
  public String randomStrExample() {
    String AbcNumString = "ABC"+ "123"+ "abc";
    String res = "";
    for (int i = 0; i < 5; i++) {
      Random r = new Random();
      res = res + AbcNumString.charAt(r.nextInt(AbcNumString.length()));
    }
    return res;
  }
  public String[] arrayStrExample() {
    String AbcNumString = "ABC" + "123" + "abc";
    String[] arr;
    arr = new String[10];
    String str = "";
    for (int j = 0; j < 10; j++) {
      for (int i = 0; i < 5; i++) {
        Random r = new Random();
        str = str + AbcNumString.charAt(r.nextInt(AbcNumString.length()));
      }
      arr[j] = str;
      str = "";
    }
    return arr;
  }
}
