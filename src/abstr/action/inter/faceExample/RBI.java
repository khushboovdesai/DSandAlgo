package abstr.action.inter.faceExample;

/**
 * Created by khush on 2/9/2018.
 */
 class RBI extends Sbi {

    public void extra(){
        System.out.println("**************EXTRA GETS OVERRIDDEN??**********************");
    }

    @Override
    public void roi() {
        System.out.println("**********RBI is a third class used to call the abstract class Sbi " +
                " since Sbi's object cannot be instantiated*******ROI METHOD****");
    }

    @Override
    public void deposit() {
        System.out.println("**************DEPOSIT METHOD**********************");
    }
}
