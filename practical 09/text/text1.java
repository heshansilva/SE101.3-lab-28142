package com.mycompany.text1;
import java.io.*;
public class Text1 
{
    public static void main(String[] args)
    {
        try
        {
            File file=new File("C:\\javatemp\\Test.txt");
            FileWriter fw=new FileWriter(file);
            fw.write("Hello World!");
            fw.flush();
            fw.close();
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            System.out.println(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
