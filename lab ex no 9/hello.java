/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;
import java.util.Scanner;
/**
 *
 * @author kamalika
 */
public class hello {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("Enter string");
        String s=obj.next();
        try
        {
            hellochecker hello=new hellochecker(s);
            hello.checker();
        }
         catch(helloexception h)
         {
             System.out.println(h);
         }
    }
    
}
class hellochecker
{
    String str,str1;
    hellochecker(String s1)
    {
        str=s1;
        str1="hello";
    }
    void checker() throws helloexception
    {
        if(str.equals(str1))
       
        {
            throw new helloexception("The message is valid");
        }
      
        System.out.println("Invalid message");
    }
}
class helloexception extends Exception
    {
    helloexception(String s)
    {
        super(s);
    }
}  