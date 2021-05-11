/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatics.rectangle;

import java.text.NumberFormat;

/**
 *
 * @author Erikaphoebes
 */
public class Rectangle {
    
    private double length;
    private double width;
    
    public Rectangle() {
        length = 0;
        width = 0;
    }

    /**
     * Get the value of length
     *
     * @return the value of length
     */
    public double getLength() {
        return length;
    }

    /**
     * Set the value of length
     *
     * @param length new value of length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        double area = width * length;
        return area;
    }
    
    public String getAreaNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getArea());
        return numberFormatted;        
    }
    
    public double getPerimeter() {
        double perimeter = 2 * width + 2 * length;
        return perimeter;
    }
    
    public String getPerimeterNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String numberFormatted = number.format(this.getPerimeter());
        return numberFormatted;        
    }        

}
