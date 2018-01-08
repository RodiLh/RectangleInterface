package main;

import interfaces.CalcGeo;
import carre.Carre;
import cercle.Cercle;
import rectangle.Rectangle;

/**
 *
 * @author dmr
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(4, 5);
        Carre c = new Carre(6);
        Cercle ce = new Cercle(3);
                
        
        afficheSurface(ce);
        affichePerimetre(c);
        
        // On dit que les objets implémentent l'interface CalcGeo
        // Comparable (de mon point de vue) à Object avec les méthodes de l'interface en plus
        CalcGeo r1 = new Rectangle();
        CalcGeo c1 = new Carre();
        CalcGeo ce1 = new Cercle();
        
    }
    
    // paramètre de type Rectangle, se rapporte aux objets du même type
    public static void affiche(Rectangle rectangle) {
        System.out.println(rectangle);
    }
    
    // Paramètre utilisant une interface, se rapporte aux différents objets 
    // et type d'objets implémentant l'interface en paramètre
    public static void afficheSurface(CalcGeo obj) {
        System.out.println("Surface : " + obj.getSurface());
    }
    
    public static void affichePerimetre(CalcGeo obj) {
        System.out.println("Périmètre : " + obj.getPerimetre());
    }
}

