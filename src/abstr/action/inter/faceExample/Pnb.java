package abstr.action.inter.faceExample;

/**
 * Created by khush on 2/9/2018.
 */
public class Pnb extends qwerty implements banking, atm {

    Pnb(){
        System.out.println("hmmmm");
    }
    @Override
    public void roi() {
        System.out.println("PNB implements banking so roi is 50%");
    }


    public String roi1() {
        return "PNB implements banking so roi is 50%";
    }
   @Override
    public void deposit() {
        System.out.println("PNB implements banking and atm to deposit 7777%");
    }

    @Override
    public void extra() {
        System.out.print("Pnb also extraaaaaaaaa");
    }

    public void withdraw() {
        System.out.println("PNB implements atm to withdraw 3000");
    }
}
