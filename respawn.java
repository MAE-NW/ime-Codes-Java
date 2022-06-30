package JAVARuntime;

import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

public class respawn extends Component { 
public float xmae;
public float ymae;
public float zmae;
public float ifequalsymaeposition;
    @Override
    public void start() {
        
    }

    @Override
    public void repeat() {
//ifequalsymaeposition example--> -5
        if (myObject.getTransform().getPosition().getY() < ifequalsymaeposition) {
myObject.getTransform().setPosition(xmae,ymae,zmae);
}else{
}
    }

    @Override
    public void disabledRepeat() {
        
    }
}
