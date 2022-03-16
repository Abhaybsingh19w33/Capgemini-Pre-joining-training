package Abhay.Package1;
import Abhay.Package1.A.*;

public class B {
    void test ()  {
        A a1;
        a1 = new A();
        a1.fn();
        a1.fnPublic();
        a1.fnPrivate(); // error
        a1.fnProtected();
    }
}