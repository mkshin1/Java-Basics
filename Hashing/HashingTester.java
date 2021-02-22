
public class HashingTester {
  public static void main(String[] args) {
    Hashing test = new Hashing();
    test.setPlaylist("bang bang", "lyrics goes here");
    test.playlist();
    test.getSong("Song");
    test.displayAll();
  }
}