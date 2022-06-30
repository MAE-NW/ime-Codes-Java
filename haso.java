//haso = hide and show object
package JAVARuntime;


import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;


public class haso extends Component { 
public SpatialObject objmae= null;
  public String keybtnmae;
 private boolean maeisvisible;


    @Override
    public void start() {
        maeisvisible = true;
    }

    @Override
    public void repeat() {
       if (Input.getKey(keybtnmae).isDown()) {
               if(maeisvisible){
                   maeisvisible = false;
         objmae.setEnabled(false);
     }else{
         maeisvisible = true;
         objmae.setEnabled(true);
         }
         }
    }

   
    @Override
    public void disabledRepeat() {
        
    }
}
