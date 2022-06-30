package JAVARuntime;

import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;


public class ChangeWorlds extends Component { 
public PFile World;

    @Override
    public void start() {
        WorldController.loadWorld(World);
    }
    

    @Override
    public void repeat() {
    }
   
    @Override
    public void disabledRepeat() {
        
    }
}
