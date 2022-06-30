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
public class fps extends Component { 
private SUIText a;
private String b;
private int c;
private long d;
private long e;
    /// Run only once
    @Override
    public void start() {
        a =(SUIText) myObject.findComponent("SUIText");
    }

    /// Repeat every frame
    @Override
    public void repeat() {
        c++;
        d=System.currentTimeMillis();
       if(d >= e){
           e= d+1000;
           b= (""+c);
           c = 0;
           a.setText("FPS :"+b);
       }
        
    }

    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
