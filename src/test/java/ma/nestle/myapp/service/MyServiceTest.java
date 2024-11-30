package ma.nestle.myapp.service;
import org.junit.Test;

import ma.nestle.myapp.service.MyService;

import static org.junit.Assert.assertEquals;

public class MyServiceTest {
 
    @Test
    public void testsomme(){
        MyService service=new MyService();
        double a=12;
        double b=18;
        double vraires=30;
        double res=service.somme(a, b);
        assertEquals( res, vraires,0.0001);
    }

}
