package practice;

public class SealedExample {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();
        impl.methodA();
        impl.methodB();
        impl.methodC();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodA();
        ib.methodB();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
