package abstr.action.inter.faceExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by khush on 2/9/2018.
 */
public class PnbTestClass {
    Pnb pnb;

    @Test
    public void testRoi(){
        pnb = new Pnb();
        Assertions.assertEquals("PNB implements banking so roi is 50%",pnb.roi1());
}
}
