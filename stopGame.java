package JAVARuntime;

import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;


public class stopGame extends Component {
    public float sp;
    @Override
    public void start() {
      //sp = speed game 
      //1.0 = normal speed
      //0.0 = stop game
      Time.setTimeSpeed(sp);
      
    }
    @Override
    public void repeat() {
       
        }
    @Override
    public void disabledRepeat() {
        
    }
}
