/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

/**
 *
 * @author nguyen
 */
public class Point {
    short x_value;
    short y_value;

    public Point(short x_value, short y_value) {
        this.x_value = x_value;
        this.y_value = y_value;
        
    }

    public short getX_value() {
        return x_value;
    }

    public short getY_value() {
        return y_value;
    }

    public void setX_value(short x_value) {
        this.x_value = x_value;
    }

    public void setY_value(short y_value) {
        this.y_value = y_value;
    }
    
    
}
