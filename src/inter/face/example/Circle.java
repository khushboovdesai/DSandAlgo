package inter.face.example;

/**
 * Created by khush on 2/8/2018.
 */
public class Circle extends Shape {
    @Override
    public void drawShape() {
        System.out.println("This is from Circle Class to drawShape");
    }


    @Override
    public void fillColor() {
        System.out.println("This is from Circle Class to fillColor");
    }

    public void drawShape(int rad) {
        System.out.println("This is Circle class nu Circle"+ rad);
    }
}
