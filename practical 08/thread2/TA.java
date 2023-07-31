package com.mycompany.thread2;
public class TA extends Thread
{
    public TA()
    {
        super();
    }
    
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            System.out.println(i);
        }
    }
    
}
