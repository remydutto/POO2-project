package zones;
import Location.*;

abstract class SiteTouristique {
    String nom;
    String InterretTouristique;
    Location l;

    public SiteTouristique(String nom,String IT,Location l){
        this.InterretTouristique = IT;
        this.nom=nom;
        this.l=l;
    }
    public SiteTouristique(String nom,String IT,int x,int y, String ville){
        this(nom,IT,new Location(ville,x,y));
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public Location getLocation(){return l;}
    public String getInterretTouristique(){return InterretTouristique;}

}
