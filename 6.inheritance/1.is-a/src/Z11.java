class A 
{
    public void test1()
    {
        System.out.println("form A.test1()");
    }
}
class B extends A
{
    public void test2()
    {
        System.out.println("form B.test2()");
    }
}
class C extends A
{
    
    public void test3()
    {
        System.out.println("form C.test3()");
    }

}
class D extends A
{
    
    public void test4()
    {
        System.out.println("form D.test4()");
    }

}
public class Z11
{
    public static void main(String[] args)
    {
        B b1 = new B();
        b1.test1();
        b1.test2();

        C c1 = new C();
        c1.test1();
        c1.test3();

        D d1 = new D();
        d1.test1();
        d1.test4();
    }

}


