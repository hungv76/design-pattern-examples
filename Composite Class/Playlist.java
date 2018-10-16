import java.util.ArrayList;

public class Playlist implements IComponent {
  public String playlistName;
  public ArrayList<IComponent> playlist = new ArrayList();

  public Playlist(String playlistName) {
    this.playlistName = playlistName;
  }

  public void play() {
    for(IComponent component: this.playlist){
      component.play();
    }
  }

  public void setPlayBackSpeed(float speed) {
    for (IComponent component : this.playlist) {
      component.setPlayBackSpeed(speed);
    }
  }

  public String getName() {
    return this.playlistName;
  }

  public void add(IComponent component) {
    playlist.add(component);
  }

  public void remove(IComponent component) {
    this.playlist.remove((component));
  }

}