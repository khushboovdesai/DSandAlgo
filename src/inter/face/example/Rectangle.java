package inter.face.example;

/**
 * Created by khush on 2/8/2018.
 */
public class Rectangle extends Shape {
    @Override
    public void drawShape() {
        System.out.println("This is from Rectangle Class to drawShape");
    }

    @Override
    public void fillColor() {
        System.out.println("This is from Rectangle Class to fillColor");
    }
    public void drawShape(int len, int b) {
        System.out.println("This is Rectangle class nu rect"+ len + "width" + b);
    }

}
