/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Person {
    
    public boolean canSing() {
        return false;
    }  
    
    public boolean canDance() {
        return false;
    }   
    
    public boolean canCode() {
        return false;
    }
}

class Singer extends Person {
    
    public boolean canSing() {
        return true;
    }
}


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Person normal = new Person();
	    
	    Person singer = new Singer();
	    
	    System.out.println("Normal Can Sing? " + normal.canSing());
	    System.out.println("Singer Can Sing? " + singer.canSing());
	    
		
	}
}
