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
public class deleteObject extends Component { 

    /// Run only once
    @Override
    public void start() {
        myObject.destroy();
    }

    /// Repeat every frame
    @Override
    public void repeat() {
       
    }

    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
