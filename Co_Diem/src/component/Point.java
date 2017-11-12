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
    byte x_value;
    byte y_value;

    public Point(byte x_value, byte y_value) {
        this.x_value = x_value;
        this.y_value = y_value;
        
    }

    public byte getX_value() {
        return x_value;
    }

    public byte getY_value() {
        return y_value;
       
    }

    public void setX_value(byte x_value) {
        this.x_value = x_value;
    }

    public void setY_value(byte y_value) {
        this.y_value = y_value;
    }
    
    public Point[] realizableMove(byte[][] broardChess){
        Point[] Moves = new Point[8];
        byte camp = broardChess[x_value][y_value];
        byte index = 0;
        if( (broardChess[x_value+1][y_value] == 0) && x_value+2 <= 8){
            if((y_value - 1 >= 1) && (broardChess[x_value+2][y_value-1] != camp)){
               Point k = new Point( (byte)(x_value+ 2) , (byte) (y_value-1));
               Moves[index] = k;
               index++;
            } 
            if((y_value + 1 <= 8) && (broardChess[x_value+2][y_value+1] != camp)){
               Point k = new Point( (byte)(x_value+ 2) , (byte) (y_value+1));
               Moves[index] = k;
               index++;
            } 
        }
        
        if( (broardChess[x_value-1][y_value] == 0) && x_value-2 >= 1 ){
            if((y_value - 1 >= 1) && (broardChess[x_value-2][y_value-1] != camp)){
               Point k = new Point( (byte)(x_value - 2) , (byte) (y_value-1));
               Moves[index] = k;
               index++;
            } 
            if((y_value + 1 <= 8) && (broardChess[x_value-2][y_value+1] != camp)){
               Point k = new Point( (byte)(x_value - 2) , (byte) (y_value+1));
               Moves[index] = k;
               index++;
            } 
        }
        
        if( (broardChess[x_value][y_value-1] == 0) && y_value-2 <= 8  ){
            if((x_value - 1 >= 1) && (broardChess[x_value-1][y_value-2] != camp)){
               Point k = new Point( (byte)(x_value-1) , (byte) (y_value-2));
               Moves[index] = k;
               index++;
            }
            
            if((x_value + 1 <= 8) && (broardChess[x_value+1][y_value-2] != camp)){
               Point k = new Point( (byte)(x_value+1) , (byte) (y_value-2));
               Moves[index] = k;
               index++;
            } 
            
        }
        
        if( (broardChess[x_value][y_value+1] == 0) && y_value+2 <= 8  ){
            if((x_value + 1 <= 8) && (broardChess[x_value+1][y_value+2] != camp)){
               Point k = new Point( (byte)(x_value+ 1) , (byte) (y_value+2));
               Moves[index] = k;
               index++;
            } 
            
            if((x_value - 1 >= 1) && (broardChess[x_value-1][y_value+2] != camp)){
               Point k = new Point( (byte)(x_value-1) , (byte) (y_value+2));
               Moves[index] = k;
               index++;
            } 
        }
        return Moves;
    }
    
    
}
