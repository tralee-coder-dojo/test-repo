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
    
    public int howManyCharactersInIdea() {
        return idea.length();
    }
    
    public Person biggestIdea(Person person) {
        Person ret = null;
        if(this.howManyCharactersInIdea() > person.howManyCharactersInIdea()) {
            ret = this;
        }    
        else {
            ret = person;
        }
        return ret;
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
	    Person def = new Person();
	    
		Person first = new Person("I don't what to say Hello World");
		
		Person second = new Person("I do want to say it many times");
		
		first.say();
		
		second.sayNTimes(3);
		
		System.out.println(second.howManyCharactersInIdea());
		
		Person bestIdea = second.biggestIdea(def);
		
		System.out.println("Best Idea in the world is: " );
		bestIdea.say();
		
		
	}
}
