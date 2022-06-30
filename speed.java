package JAVARuntime;

// Useful imports
import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

public class speed extends Component { 
public float speed;
    @Override
    public void start() {
        
    }
    @Override
    public void repeat() {
        myObject.getTransform().moveInSeconds(0,0,speed);
    }

    @Override
    public void disabledRepeat() {
        
    }
}
