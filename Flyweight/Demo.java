/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

/**
 *
 * @author JAVERIA
 */
public class Demo {
    private static final String colors[]={"Red","Blue","green","orange","purple","whtie"};
        private static final int thickness[]={5,2,3};

    
    public static void main(String[] args){
        for(int i=0;i<20;++i){
            Circle circle=(Circle)ShapeFactory.getCircle(getRandomColor());
            circle.drawX(getRandomX());
            circle.drawY(getRandomY());
            circle.setRadius(getRandomradius());
            circle.draw();
            
        }
         for (int i = 0; i < 10; ++i) {
           Polygon polygon = (Polygon) ShapeFactory.getPolygon(getRandomColor());
           polygon.setX(getRandomX());
           polygon.setY(getRandomY());
           polygon.setLineThickness(3);
           polygon.draw();
       }
           for (int i = 0; i < 10; ++i) {
           Rectangle rectangle = (Rectangle) ShapeFactory.getRectangle(getRandomColor());
           rectangle.setX(getRandomX());
           rectangle.setY(getRandomY());
           rectangle.setLineThickness(5);
           rectangle.draw();
      }
    }
     private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }

    private static int getRandomX() {
return (int)(Math.random()*100 );    }

    private static int getRandomY() {
      return (int)(Math.random()*100);
    }

    private static int getRandomradius() {
         return (int)(Math.random()*100);
    }
    
}
