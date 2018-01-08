package cercle;
import interfaces.CalcGeo;

/**
 *
 * @author dmr
 */
public class Cercle implements interfaces.CalcGeo {
    
    private double rayon;
    
    public Cercle() {
        System.out.println("Création d'un cercle par défaut");
        this.rayon = 0;
    }
    
    public Cercle(int rayon) {
        System.out.println("Création d'un cercle");
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
    
    public double getDiametre() {
        return rayon * 2;
    }
    
    @Override
    public double getSurface() {
         return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double getPerimetre() {
        return (2 * Math.PI * rayon);
    }
    
}
