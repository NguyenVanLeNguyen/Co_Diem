/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyen
 */
public class StatusOfBroard 
{
    
    
    private byte[][] broadChess ;
    private ArrayList<StatusOfBroard> childrens ;
    private int value;
    private boolean styte;
    
    public StatusOfBroard() 
    {
        broadChess = new byte[8][8];
        childrens = new ArrayList<>();
    }

    public StatusOfBroard(byte[][] broadChess, List<StatusOfBroard> children) 
    {
        this.broadChess = broadChess;
    }

    public byte[][] getBroadChess() 
    {
        return broadChess;
    }

    public ArrayList<StatusOfBroard> getChildrens() 
    {
        return childrens;
    }       

    public int getValue() 
    {
        return value;
    }

    public boolean getStyte() 
    {
        return styte;
    }
   
    public void setBroadChess(byte[][] broadChess) 
    {
        this.broadChess = broadChess;
    }

    public void setChildrens(ArrayList<StatusOfBroard> childrens) 
    {
        this.childrens = childrens;
    }

    public void setValue(int value) 
    {
        this.value = value;
    }

    public void setStyte(boolean styte) 
    {
        this.styte = styte;
    }
  
    public boolean isLeaf()
    {
        if( this.childrens.isEmpty() || this.childrens == null )
            return true;
        else
            return false;
    }
    
}
