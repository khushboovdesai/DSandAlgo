package inter.face.example;

/**
 * Created by khush on 2/8/2018.
 */
public class Square extends Shape {
    @Override
    public void drawShape() {
        System.out.println("This is from Square Class to drawShape");
    }

    @Override
    public void fillColor() {
        System.out.println("This is from Square Class to fillColor");
    }

    public void drawShape(float len) {
        System.out.println("This is SQUaRE class nu square"+ len);
    }
}
