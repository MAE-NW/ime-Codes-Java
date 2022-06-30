package JAVARuntime;

// Useful imports
import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

/**
 * @Author 
*/
public class haso extends Component { 
public SpatialObject obj= null;
  public String keybtn;
 private boolean isvisible;
    /// Run only once
    @Override
    public void start() {
        isvisible = true;
    }

    /// Repeat every frame
    @Override
    public void repeat() {
       if (Input.getKey(keybtn).isDown()) {
               if(isvisible){
                   isvisible = false;
         obj.setEnabled(false);
     }else{
         isvisible = true;
         obj.setEnabled(true);
         }
         }
    }

    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
