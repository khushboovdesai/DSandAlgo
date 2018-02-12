import com.student.calculate.Calculator;

public class Main {
    public static void main(String args[]){
     System.out.println("Hello JAVA!");

     Calculator obj = new Calculator(11);

     System.out.println(obj.add(6,9));

     int divBoy = obj.div(2,2);

        System.out.println(obj.mul(3,4));
        System.out.println(obj.sub(4,4));
        System.out.println("Div result is:" + divBoy);
        System.out.println(obj.mod(4,4));
    }

}
