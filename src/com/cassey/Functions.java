package com.cassey;

public class Functions {

//    drone
//    access modifiers


    protected double volumeSphere(double radius){
        double volume = 22/7.0 * Math.pow(radius,3) *4/3.0;
        return volume;
    }
    public static double areaCircle(double radius){
double area = 22/7.0 * radius * radius;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args) {

        //objects == variables
        Functions f = new Functions(); //        create object
        System.out.println(f.volumeSphere(7));
        double v = f.volumeSphere(11);
        Functions.areaCircle(23);




//areaCircle(7);
//areaCircle(9.1);
//areaCircle(209.69);
//
//double result = areaCircle(11.11758);
//        System.out.println(Math.round(result));
//        System.out.println(result *13);
    }
}
