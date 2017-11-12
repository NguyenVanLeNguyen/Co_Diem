/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codiem;

import component.Point;

/**
 *
 * @author nguyen
 */
public class CoDiem {
    static byte[][] broadChess = new byte[8][8];
    static Point[] white = new Point[6];
    static Point[] black = new Point[6];

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[][] BroadChess = new byte[8][8];
        byte u = 0;
        byte i = (byte) (u + 1);
        
    }
    
    public void updateStatus(){
        for(int i=1; i <= 8; i++)
        {
          for(int j = 1; j <= 8; j++)
          {
              broadChess[i][j] = 0;
          }  
        }
        
        for(int i = 0; i < 6; i++){
            if( (white[i].getX_value() != 0) || (white[i].getY_value() != 0) )
            {
                broadChess[white[i].getX_value()][white[i].getY_value()] = 1; 
            }
             if( (black[i].getX_value() != 0) || (black[i].getY_value() != 0) )
             {
                 broadChess[black[i].getX_value()][black[i].getY_value()] = 2;
             }   
        }
    }
    
}
