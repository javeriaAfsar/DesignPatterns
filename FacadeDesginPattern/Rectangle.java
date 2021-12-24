/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDesginPattern;

/**
 *
 * @author JAVERIA
 */
public class Rectangle implements Shape{

    @Override
    public void draw(String color,int size) {
        StringBuilder sb=new StringBuilder();

      //sb.insert(size, color);
      sb.append(color);
      sb.append(size);
      System.out.println("Rectangle drawn with color: " + color+ " size: " +size);
    }
    
}
