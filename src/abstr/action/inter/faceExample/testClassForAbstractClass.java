package abstr.action.inter.faceExample;

/**
 * Created by khush on 2/9/2018.
 */
public class testClassForAbstractClass {
    public static void main(String args[]){
        /*
        Bank is abstract class so we can't create it's instance that is
        Bank obj1= new Bank();          is not possible
        Also, Bank obj1=new banking(); Bank obj1=new atm();  atm a = new atm(); banking b = new banking();
        atm aa=new Bank();              is not possible as banking & atm & Bank is abstract
        */


       /* Bank obj1=new Pnb();
        obj1.roi();*/



        atm obj2=new Pnb();
        obj2.withdraw();
        obj2.deposit();

   /*     atm obj3=new Chase();
        obj3.deposit();
        obj3.withdraw();

        Pnb obj4= new Pnb();
        obj4.extra();
        obj4.roi();
        obj4.withdraw();
        obj4.deposit();

        Chase obj5=new Chase();
        obj5.roi();
        obj5.deposit();
        obj5.withdraw();
        obj5.extra();

        banking obj6=new RBI();
        obj6.deposit();
        obj6.roi();
        obj6.extra();

        RBI obj7=new RBI();
        obj7.deposit();
        obj7.roi();
        obj7.extra();

        Sbi obj8=new RBI();
        obj8.extra();
        obj8.roi();
        obj8.deposit();
*/

    }
}
