package Abhay.Package2;
import Abhay.Package1.A;

public class D extends A {
    void test1 () {
        A a1;
        a1 = new A();
        a1.fn(); //error
        a1.fnPublic();
        a1.fnPrivate(); // error
        a1.fnProtected(); // error
    }

    void test2 () {
        super.fn(); // error
        super.fnPublic();
        super.fnPrivate(); // error
        super.fnProtected();
    } 
}