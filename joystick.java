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
public class joystick extends Component { 

public float speed;
 /// Run only once
    @Override
    public void start() {
        
    }

    /// Repeat every frame
    @Override
    public void repeat() {
        myObject.getTransform().moveInSeconds(Input.getAxis("axis").getValue().getX() * speed , 0, Input.getAxis("axis").getValue().getY() * speed);
    }

    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
