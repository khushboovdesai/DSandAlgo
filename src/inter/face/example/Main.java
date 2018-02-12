package inter.face.example;

import java.awt.*;

/**
 * Created by khush on 2/8/2018.
 */
public class Main {
    public static void main(String args[]){
        Shape obj = new Shape();
        obj.drawShape();
        obj.fillColor();
        obj.drawShape((float) 2.2);
        obj.drawShape(2,2);
        obj.drawShape(3);

        Rectangle rect= new Rectangle();
        rect.drawShape();
        rect.fillColor();
        rect.drawShape(9,6);

        Shape cir = new Circle();
        cir.drawShape();
        cir.fillColor();
        cir.drawShape(8);
        cir.drawShape(1,2);
        cir.drawShape((float)1.1);

        draw d = new Shape(); //abstraction : since shows only necessary info as well as inheritance !
        d.drawShape();


        color c = new Shape();
        c.fillColor();


    }
}
