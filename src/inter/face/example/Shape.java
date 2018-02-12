package inter.face.example;

/**
 * Created by khush on 2/8/2018.
 */
public class Shape implements color, draw {

    @Override
    public void drawShape() {
        System.out.println("This is from Shape Class and draw interface");
    }

    public void drawShape(float len) {
        System.out.println("This is Shape class nu square"+len);
    }
    public void drawShape(int len, int b) {
        System.out.println("This is Shape class nu rect"+len+"width"+b);
    }
    public void drawShape(int rad) {
        System.out.println("This is Shape class nu Circle"+ rad);
    }

    @Override
    public void fillColor() {
        System.out.println("This is from Shape Class and color interface");
    }


}
