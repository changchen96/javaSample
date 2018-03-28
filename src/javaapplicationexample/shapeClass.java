/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationexample;
import java.lang.Math.*;
/**
 *
 * @author c7-ong
 */
class defaultShapeClass {
    double result;
    public void squarePerimeter(int a, int b)
    {
        result = 2*a + 2*b;
        System.out.println("Perimeter of a square is "+ result);
    }
    public void squareArea(int a, int b)
    {
        result = a* b;
        System.out.println("Area of a square is "+result);
    }
    
}

//public class name must be the same as the file name
public class shapeClass extends defaultShapeClass
{
    public shapeClass()
    {
        System.out.println("Demonstration of inherited class from the preceeding class in the file");
    }
    public void trianglePerimeter(int a, int b)
    {
        result = a + 2*b;
        System.out.println("Perimeter of a triangle is "+result);
    }
    public void triangleArea(int a, int b)
    {
        result = a * b / 2;
        System.out.println("Area of a triangle is "+result);
    }
    public void circlePerimeter(int a)
    {
        result = 2 * Math.PI * a;
        System.out.println("Circumference of a circle is "+result);
    }
    public void circleArea(int a)
    {
        result = Math.PI * a * a;
        System.out.println("Area of a circle is "+ result);
    }
}
