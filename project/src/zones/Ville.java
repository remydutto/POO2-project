package zones;
import Location.*;

class Ville extends SiteTouristique {
    Ville(String IT, Location l){
    super(l.getVille(),IT,l);

}
    Ville(String nom,String IT,int x, int y){
        this(IT,new Location(nom,x,y));
    }
}
