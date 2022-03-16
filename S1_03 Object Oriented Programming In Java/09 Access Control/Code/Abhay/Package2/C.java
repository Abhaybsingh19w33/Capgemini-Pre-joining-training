package Abhay.Package2;
import Abhay.Package1.A;


public class C {
    void test () {
        A a1;
        a1 = new A();
        a1.fn(); // error
        a1.fnPublic();
        a1.fnPrivate();  // error
        a1.fnProtected();  // error
    }
}