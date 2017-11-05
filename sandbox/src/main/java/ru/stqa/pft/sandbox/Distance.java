package ru.stqa.pft.sandbox;

public class Distance {
  public static void main(String[] args){

    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);
    //System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "; " + p1.y + ") и (" + p2.x + "; " + p2.y + ") = " + String.format("%.2f",distance(p1,p2)));
    System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "; " + p1.y + ") и (" + p2.x + "; " + p2.y + ") = " + String.format("%.4f",p1.distance(p2)));

    p1 = new Point(0, -9.3);
    p2 = new Point(-18.5, 25.15);
    System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "; " + p1.y + ") и (" + p2.x + "; " + p2.y + ") = " + String.format("%.4f",p1.distance(p2)));
    System.out.println("Расстояние (без округления) между двумя точками с координатами (" + p1.x + "; " + p1.y + ") и (" + p2.x + "; " + p2.y + ") = " + p1.distance(p2));

    p1 = new Point(1, 1);
    p2 = new Point(1, 1);
    System.out.println("Расстояние между двумя точками с координатами (" + p1.x + "; " + p1.y + ") и (" + p2.x + "; " + p2.y + ") = " + String.format("%.4f",p1.distance(p2)));

  }

 /*public static double distance(Point p1, Point p2){
 return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
 }*/

}

