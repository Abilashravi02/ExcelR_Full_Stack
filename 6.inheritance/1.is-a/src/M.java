class L 
{
    L()
    {
         System.out.println("L()");
    }
}
class M extends L
{
M()
    {
     System.out.println("M()");
    }

    public static void main(String[] args) 
    {
        M obj = new M();
        
    }
}
/*
-all the in-bulit classes and all theier the user-defined classes are going to inherits object classs wherther it can be directly or indiresctly.
-multiple inheritance is not possible through classes
-but possible with interfaces