import java.util.ArrayList;

public class Song implements IComponent {
  public String songName;
  public String artist;
  public float speed = 1;

  public Song(String songName, String artist) {
    this.songName = songName;
    this.artist = artist;
  }

  public void play() {
    System.out.println("Playing the song name: "+ this.getName() + "with speed: " + this.speed);
  }

  public void setPlayBackSpeed(float speed) {
    this.speed = speed;
  }

  public String getName() {
    return this.songName;
  }

  public String getArtist() {
    return this.artist;
  }

}