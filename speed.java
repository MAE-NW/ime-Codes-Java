package JAVARuntime;

import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

public class speed extends Component { 
public float speedmae;
    @Override
    public void start() {
        
    }
    @Override
    public void repeat() {
        myObject.getTransform().moveInSeconds(0,0,speedmae);
    }

    @Override
    public void disabledRepeat() {
        
    }
}
