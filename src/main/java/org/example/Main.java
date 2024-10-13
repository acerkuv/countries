package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        There are coordinates of the city
        int x = 0, y =  1;
//        There are coordinates of the countries
        int [][] mapOTheCountries ={{-2, 0, 2, 0, 0, 2},{-3, 0, 3, 0, 0, 3}};
        for(int[] i: mapOTheCountries) System.out.println("The city x= " + x +" y= " + y +
              " is into the coordinates " + Arrays.toString(i) + " = " +
                       isIntoTheTriangle (i, x, y ));
    }
    public static boolean isIntoTheTriangle(int[] triangleCord, int x, int y){
        /*
        These scalar multiplies must have the same sign to be into the triangle.
        (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0)
        (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0)
        (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0)
        */
        int x0 = x, y0 = y;
        int x1 = triangleCord[0], x2=triangleCord[2], x3=triangleCord[4];
        int y1 = triangleCord[1], y2= triangleCord[3], y3 =triangleCord[5];
        int m1 = (x1 - x0) * (y2 -y1) -(x2-x1) *(y1-y0);
        int m2 =(x2 -x0) * (y3- y2) - (x3-x2) * (y2 - y0);
        int m3 = (x3 -x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);

        if((m1 > 0 && m2 >0 && m3 >0) || (m1 < 0 && m2 <0 && m3 <0)) return true;

        return false;
    }
}