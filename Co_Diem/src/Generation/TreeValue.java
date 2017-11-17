/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generation;

import component.*;

/**
 *
 * @author nguyen
 */
public class TreeValue {
    private StatusOfBroard current;
   
    public void minMaxSearch(StatusOfBroard currentNote)
    {
        if(!currentNote.isLeaf()){
            
        }
    }
    
    public void setValue(StatusOfBroard Note){
        if(Note.getStyte())
        {
            int item = 0;
            if( (Note.getChildrens() != null) && (!Note.getChildrens().isEmpty()) )
            {
                 for(StatusOfBroard  note :  Note.getChildrens())
                 {
                    item = (note.getValue() >= item)? item : note.getValue();
                 }
            }
        }
        
        else
        {
            int item = 0;
            if( (Note.getChildrens() != null) && (!Note.getChildrens().isEmpty()) )
            {
                for(StatusOfBroard  note :  Note.getChildrens())
                {
                    item = (note.getValue() <= item)? item : note.getValue();
                }
            }
        }   
    }
    
}
    

