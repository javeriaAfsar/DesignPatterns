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
public class Circle implements Shape{
    private String color;
    private int x;
    private int y;
    private int radius;
    public Circle(String color)
    {
        this.color=color;
    }
   public void drawX(int y)
   {
       this.x=x;
   }
   public void drawY(int y)
   {
       this.y=y;
       
   }
   public void setRadius(int radius){
       this.radius=radius;
    
}
    @Override
    public void draw() {
        System.out.println("Circle draw:[Color"+color+",X:"+x+",Y:"+y+"Radius"+radius+"]");
    }
    
}
