/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhand;
import java.util.Scanner;
/**
 *
 * @author kamalika
 */
public class Exceptionhand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in); 
        exception obj1=new exception();
        obj1.arithmetic();
        obj1.numberformat();
        System.out.println("Enter the array index btw 5 otherwise shows error:");
        int element=obj.nextInt();
        obj1.arrayindex(element);
        System.out.println("Enter the string:");
        String str=obj.next();
        obj1.stringindex(str);
    }
    
}
class exception
{
    void arithmetic()
    {
        int a=5;
        int b=0;int c;
        try
        {
            c=a/b;
                System.out.println("divisible");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    void numberformat()
    {
        String str="123.45";
        try
        {
           int a=Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    }
    void arrayindex(int ele)
    {
        int arr[]={1,2,3,4,5};
        try
        {
            System.out.println("Element in the given index"+arr[ele]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    void stringindex(String str1)
    {
        try
        {
            System.out.println(str1.charAt(50));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}