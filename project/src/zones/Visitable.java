package zones;
import Location.*;

public class Visitable extends SiteTouristique {
    boolean visitable;

    public Visitable(String nom, String IT, Location l, boolean visitable) {
        super(nom, IT, l);
        this.visitable = visitable;
    }

    public Visitable(String nom, String IT, String Ville, int x, int y, boolean visitable) {
        this(nom, IT, new Location(Ville, x, y),visitable);
    }
    public boolean getVisitable(){
        return visitable;
    }
}
