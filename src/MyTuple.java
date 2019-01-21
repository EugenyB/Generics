public class MyTuple<A,B,C> {

    private A a ;
    private B b ;
    private C c ;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B n1) {
        this.b = b;
    }

    public C geC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
