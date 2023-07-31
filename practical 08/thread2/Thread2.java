package com.mycompany.thread2;
public class Thread2 
{
    public static void main(String[] args) 
    {
        TAA t1=new TAA();
        TAA t2=new TAA();
        
        t1.start();
        t2.start();
    }
}
