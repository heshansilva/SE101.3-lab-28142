package com.mycompany.testinheritance;
public class TestInheritance 
{
    public static void main(String[] args)
    {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() );
        /*The output of the above operations will be 9 because x starts with 2, 
        then we increment it by 1 to get 3, and finally, we triple it to get 9*/
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() );
        /*The output of the above operations will be 6 because x starts with 2,
        then we increment it by 1 to get 3, it SubC class triple method, we add 3 to get 6*/
    }
}
