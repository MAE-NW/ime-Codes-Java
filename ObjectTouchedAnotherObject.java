package JAVARuntime;


import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

public class ObjectTouchedAnotherObject extends Component { 
private Rigidbody rbmae = new Rigidbody();
public String anotherobjectnamemae;

    @Override
    public void start() {
        rbmae = (Rigidbody)myObject.getPhysics().getPhysicsEntity();
    }
    @Override
    public void repeat() {
        //another object name = name of the ground or other...
        if (rbmae.colliderWithName(anotherobjectnamemae)) {
            Console.log("touched");
}else{
    
}
    }
    @Override
    public void disabledRepeat() {
        
    }
}
