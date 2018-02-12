package abstr.action.inter.faceExample;

/**
 * Created by khush on 2/9/2018.
 */
public class Chase implements banking,atm {

    @Override
    public void roi() {
        System.out.println("Chase implements banking and atm so roi is INVALID");
    }

    @Override
    public void deposit() {
        System.out.println("Chase implements banking and atm so deposit is MILLION DOLLAR");
    }

    @Override
    public void extra() {
        System.out.println("NOTHING EXTRA FROM CHASE");
    }

    @Override
    public void withdraw() {
        System.out.println("Chase implements banking and atm so withdrawal is ZERO DOLLAR");
    }
}
