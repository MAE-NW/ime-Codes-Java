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
public class ObjectTouchedAnotherObject extends Component { 
private Rigidbody rb = new Rigidbody();
public String anotherobjectname;
    /// Run only once
    @Override
    public void start() {
        rb = (Rigidbody)myObject.getPhysics().getPhysicsEntity();
    }
    /// Repeat every frame
    @Override
    public void repeat() {
        //another object name = name of the ground or other...
        if (rb.colliderWithName(anotherobjectname)) {
            Console.log("hhh");
}else{
    
}
    }

    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
