package com.mycompany.thread1;
public class Thread1 
{
    public static void main(String[] args)
    {
        TA1 t1=new TA1();
        TA1 t2=new TA1();
        
        Thread b1=new Thread(t1);
        Thread b2=new Thread(t2);
        
        b1.start();
        b2.start();
    }
}
