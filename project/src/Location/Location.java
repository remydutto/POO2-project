package Location;

public class Location {
    String ville;
    int x;
    int y;

    public Location(String ville, int x, int y){
        this.ville= ville;
        this.x=x;
        this.y=y;
    }

   public String getVille() {
        return ville;
    }
}
