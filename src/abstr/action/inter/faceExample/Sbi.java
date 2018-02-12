package abstr.action.inter.faceExample;

/**
 * Created by khush on 2/9/2018.
 */
 abstract class Sbi implements banking {

    /*@Override
    public void roi() {
        System.out.println("SBI is extending Bank and implementing banking so roi is 100%");
    }

    @Override
    public void deposit(){
        System.out.println("SBI is implementing banking to deposit 5555");
    }*/

    public void extra(){
        System.out.println("banking is interface with many methods. SBI is an abstract class implementing banking. " +
                "Accesses only extra method from it");
    }

}


