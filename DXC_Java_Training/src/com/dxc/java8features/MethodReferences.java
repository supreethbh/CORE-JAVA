package com.dxc.java8features;

@FunctionalInterface
interface Calculator { 
    public void addition(int number1, int number2); 
}

class Addition {
    
    public static void staticAddition(int number1, int number2) {
	System.out.println("Sum of " + number1 + " & " + number2 + " is : " + (number1 + number2));
    }
    
    public void nonStaticAddition(int number1, int number2) {
	System.out.println("Sum of " + number1 + " & " + number2 + " is : " + (number1 + number2));
    }
}

@FunctionalInterface
interface Messenger { 
    public Message getMessage(String message);
}

class Message {
    
    public Message(String message) {
	System.out.println("Message is: " + message);
    }
}


public class MethodReferences {

    public static void main(String[] args) {
	
	Addition.staticAddition(101, 7);
	
	//1. Reference to a Static Method
	Calculator calculator1 = Addition::staticAddition;
	calculator1.addition(101, 7);
	      
	//2. Reference to a Non-Static Method or Instance Method 
	Addition addition = new Addition();
	Calculator calculator2 = addition::nonStaticAddition;
	calculator2.addition(101, 7);
	
	//3. Reference to a Constructor
	Messenger messenger = Message::new;
	messenger.getMessage("Understanding our own potential & strengths to re-shape ourselves......");
    }

}
