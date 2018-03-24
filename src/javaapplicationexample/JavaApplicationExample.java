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

public class JavaApplicationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numberClass newClass = new numberClass();
        newClass.addition(10, 5);
        newClass.subtraction(10, 5);
        newClass.multiplication(10, 5);
        newClass.division(10, 5);
        newClass.additionWithPrivate(10, 5);
        
        defaultShapeClass newDefaultClass = new defaultShapeClass();
        newDefaultClass.squarePerimeter(4, 8);
        newDefaultClass.squareArea(4, 8);
        
        shapeClass newShapeClass = new shapeClass();
        newShapeClass.circleArea(4);
        newShapeClass.circlePerimeter(4);
        newShapeClass.triangleArea(4, 8);
        newShapeClass.trianglePerimeter(4, 8);
    }
    
}
