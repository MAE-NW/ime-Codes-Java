package JAVARuntime;


import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;


public class joystick extends Component { 

public float speedmae;
    @Override
    public void start() {
        
    }
    @Override
    public void repeat() {
        myObject.getTransform().moveInSeconds(Input.getAxis("axis").getValue().getX() * speedmae , 0, Input.getAxis("axis").getValue().getY() * speedmae);
    }

    @Override
    public void disabledRepeat() {
        
    }
}
