package JAVARuntime;

import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

public class deleteObject extends Component { 

    @Override
    public void start() {
        myObject.destroy();
    }

    @Override
    public void repeat() {
       
    }

    @Override
    public void disabledRepeat() {
        
    }
}
