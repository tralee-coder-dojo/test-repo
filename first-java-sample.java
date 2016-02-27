/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Person {
    
    private String idea = "zzz";
    
    public Person() {
    }
    
    public Person(String text) {
        this.idea = text;    
    }
    
    public void say() {
        System.out.println(idea);
    }
    
    public void sayNTimes(int times) {
        
        for(int i = 0; i < times; i++) {
            this.say();
        }
    }
    
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Person first = new Person("I don't what to say Hello World");
		
		Person second = new Person("I do want to say it many times");
		
		first.say();
		
		second.sayNTimes(3);
		
		
	}
}
