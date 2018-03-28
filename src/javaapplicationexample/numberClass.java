/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationexample;

/**
 *
 * @author c7-ong
 */
public class numberClass {
    private int privateNum = 2;
    public numberClass()
    {
        System.out.println("Demonstration of classes and their functions");
    }
    
    public void addition(int a, int b)
    {
        int sum = a + b;
        System.out.println(a + "+" + b +"="+sum );
    }
    
    public void subtraction(int a, int b)
    {
        int sum = a - b;
        System.out.println(a + "-" + b +"="+sum );
    }
    
    public void multiplication(int a, int b)
    {
        int sum = a * b;
        System.out.println(a + "*" + b +"="+sum );
    }
    
    public void division(int a, int b)
    {
        int sum = a / b;
        System.out.println(a + "/" + b +"="+sum );
    }
    
    public void additionWithPrivate(int a, int b)
    {
        int sum = a + b + privateNum;
        System.out.println("Private number is " + privateNum);
        System.out.println(a + "+" + b +"+"+ privateNum + "="+sum );
    }
}
