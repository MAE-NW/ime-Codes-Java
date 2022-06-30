package JAVARuntime;

import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;


public class Get extends Component {
public float getted;
private Post post;
    @Override
    public void start() {
        post = (Post) myObject.findComponent("Post");
    }

    @Override
    public void repeat() {
        getted = post.v2+post.var;
    }

   
    @Override
    public void disabledRepeat() {
        
    }
}
