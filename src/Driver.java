package com.company;
import shapes.Square;
import shapes.Rectangle;
import utils.Math;

public class Driver {

    public static void main(String[] args) {
        double v=15.6;
        Square Sqr=new Square(200);
        Rectangle Rec=new Rectangle(10,40);
        System.out.println("Area Of The Square: "+Sqr.getArea()+" Area Of The Rectangle: "+Rec.getArea());
        System.out.println("Factorial With Recursion: "+Math.factorial((int)v)+" Factorial With Loop: "+Math.factorialLoop((int)v));
    }

}