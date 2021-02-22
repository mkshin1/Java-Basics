import java.util.Set;
import java.util.HashMap;

public class Hashing {
  private HashMap<String, String> playlist = new HashMap<String, String>();
  public void playlist(){
    playlist.put("Song 1", "Lyrics for song 1");
    playlist.put("Song 2", "Lyrics for song 2");
  
  }

    public void setPlaylist(String song, String lyrics) {
      playlist.put(song, lyrics);
    }
    public String getSong(String song) {
      String songName = playlist.get(song);
      System.out.println(songName);
      return songName;
    }
    public void displayAll() {
      Set<String> songs = playlist.keySet();
      for (String song: songs) {
        System.out.println(song+": " + playlist.get(song));
      }
    }

  
}