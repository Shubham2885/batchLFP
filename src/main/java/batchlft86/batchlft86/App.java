package batchlft86.batchlft86;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	final static Logger logger = Logger.getLogger(App.class.getName());
	
    public static void main( String[] args ) throws SecurityException, IOException
    {
        int a = 5;
        int b = 6;
        FileHandler fileHandler = new FileHandler("applog.log", true);
        logger.addHandler(fileHandler);
        //arithmatic operator
        int c = a + b;
        c = a - b;
        c = a / b;
        c = a * b;
        c = a % b;
        logger.info("Addition = "+c);
        logger.log(java.util.logging.Level.WARNING, "Addition = "+c);
        
        //variables in java
        
        //local variable
        int x = 5;
        x= 10;
        final int y = 10;
        
        //class variable
        
        //instance variable
        
         boolean flag = false;
         //relation operator < > <= >= != == 
         //logical operator && || ~
         a = 10;
         b = 30;
         c = 15;
    	if(a>b && a>c) {
    		System.out.println(a);
    	}else if(b>a && b>c) {
    		System.out.println(b);
    	}else {
    		System.out.println(c);
    	}
        System.out.println(flag);
        
//        if(a>b) {
//        	System.out.println(a);
//        }else {
//        	System.out.println(b);
//        }
        System.out.println(a>b?a:b);
        
        int i = 1;
        
//        i = i + 1;
//        i = i + 1;
        
//        i += 2;
        
        //first assign the value to i then print then increment
        System.out.println(i++);
        // first increment the value then assign to i then print
        System.out.println(++i);
        String key = "SATd";
        switch(key) {
        case "MON": System.out.println("Today is "+key+"day");
        	break;
        case "TUE":System.out.println("Today is "+key);
        	break;
        case "WED":System.out.println("Today is "+key);
        	break;
        case "THE":System.out.println("Today is "+key);
        	break;
        case "FRI":System.out.println("Today is "+key);
        	break;
        case "SAT":System.out.println("Today is "+key);
        	break;
        case "SUN":System.out.println("Today is "+key);
        	break;
        default :System.out.println("Today is not day");
        	break;
        }
        
        
        int j = 0;
        int p = 1234534;
        for(;p != 0;) {
        	System.out.println(p);
        	p = p/10;
        }
        
        p = 0;
        while(p != 0) {
        	System.out.println("while loop");
        }
        
        p = 0;
        do {
        	System.out.println("do while loop");
        }while(p != 0);
        
        
    }
    
 // it will not return anything and it will not take/passing any arguments
    void functionName(){
    	System.out.println("it will not return anything and it will not take/passing any arguments");
    }
    
    //it will return something and it will not take/passing any arguments
//    dataType functionName() {
//    	
//    }
    double getPI() {
    	return 3.142;
    }
    
    //it will not return something and it will take any arguments
//    void functionName2(datetype arg1,datetype arg2) {
//    	
//    }
    
    void addition(int x, int y) {
    	int z = x + y;
    	System.out.println(z);
    }
    
    //it will return something and it will take any arguments
    
//    retrunType functionName3(datatype arg1, datatype arg2) {
//    	retrun 0;
//    }
    
    int sub(int x, int y) {
    	return x-y;
    }
    
//    // we have as default value as arguments
//    int div(int x = 1,int y) {
//    	return x/y;
//    }
}
