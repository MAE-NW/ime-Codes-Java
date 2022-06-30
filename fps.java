package JAVARuntime;


import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;



public class fps extends Component { 
private SUIText amae1;
private String bmae2;
private int cmae3;
private long dmae4;
private long emae5;


    @Override
    public void start() {
        amae1 =(SUIText) myObject.findComponent("SUIText");
    }
    @Override
    public void repeat() {
        cmae3++;
        dmae4=System.currentTimeMillis();
       if(dmae4 >= emae5){
           emae5= dmae4+1000;
           bmae2= (""+cmae3);
           cmae3 = 0;
           amae1.setText("FPS :"+bmae2);
       }
        
    }

    @Override
    public void disabledRepeat() {
        
    }
}
