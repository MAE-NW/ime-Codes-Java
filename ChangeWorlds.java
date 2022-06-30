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
public class ChangeWorlds extends Component { 
public PFile World;
    /// Run only once
    @Override
    public void start() {
        
    }

    /// Repeat every frame
    @Override
    public void repeat() {
       if (Input.getKey("start").isUp()){
           
           WorldController.loadWorld(World);
       }
    }

    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
