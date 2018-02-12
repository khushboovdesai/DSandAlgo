package abstr.action.inter.faceExample;

/**
 * Created by khush on 2/9/2018.
 */
public abstract class Bank {

    public Bank(){
        System.out.println("printing from abstract bank class constructor");
    }
    abstract public void roi();
    //abstract public void deposit();
    //abstract public void withdraw();

}
