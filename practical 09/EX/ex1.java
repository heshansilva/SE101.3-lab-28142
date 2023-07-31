package com.mycompany.ex1;
public class EX1 
{
    public static void main(String[] args)
    {
        try
        {
            int a=8,b=2,z;
            z=a/b;
            System.out.println("Answer "+z);
            
            int aa[]=new int[7];
            aa[6]=9;
            System.out.println("Amswer "+aa[6]);
        }
        catch(ArithmeticException e1)
        {
            System.out.println(e1.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println(e2.getMessage());
        }
        finally
        {
            System.out.println("Finally block is executed");
        }
    }
}
