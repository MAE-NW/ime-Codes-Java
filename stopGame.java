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
public class stopGame extends Component {
    public float sp;
    /// Run only once
    @Override
    public void start() {
      //sp = speed game 
      //1.0 = normal speed
      //0.0 = stop game
      Time.setTimeSpeed(sp);
      
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
