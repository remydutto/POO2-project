package zones;
import Location.*;

class SiteNaturel extends SiteTouristique {
    public SiteNaturel(String nom, String IT,Location l){
        super(nom,IT,l);
    }
    public SiteNaturel(String nom, String IT, String Ville, int x, int y){
        this(nom,IT,new Location(Ville,x,y));
    }
}