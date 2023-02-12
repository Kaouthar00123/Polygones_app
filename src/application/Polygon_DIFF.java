package application;

import java.util.ArrayList;

public class Polygon_DIFF extends Decourate_Poly_usuelle{
    public Poly_Angle_Egaux A;
    public Poly_Angle_Egaux B;
    public void dessiner(){
        A.dessiner();
        B.dessiner(); // on le dessine avec color transparent pour qu'il appareisse que A moins B
    }

    @Override
    public ArrayList<Point> gen_points() {
        ArrayList<Point> L = new ArrayList<Point>();
        L.addAll( A.gen_points());
        L.addAll( B.gen_points());
        return ( L );
    }

    public void deplacer(double dx, double dy){
        A.deplacer( dx, dy);
        B.deplacer( dx, dy);
    }
    public void tourner(double angle) {
        A.tourner( angle );
        B.tourner( angle );
    }
}
