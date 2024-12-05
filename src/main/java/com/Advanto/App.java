package com.Advanto;

import java.util.Scanner;

import com.Advanto.Implemented.TRPClass;

public class App 
{
    public static void main( String[] args )
    {
       
    	TRPClass t = new TRPClass();
//    	t.insert_Buses();
    	Scanner sc = new Scanner(System.in);
    	
    	boolean flag = true;
    	while(flag) {
    		
    		System.out.println("Select one of the below");
        	System.out.println("1) Register New User");
        	System.out.println("2) Search Buses");
        	System.out.println("3) Cancal Your Ticket");
        	System.out.println("4) Update Info From The Ticket");
        	System.out.println("5) Exit");
        	
    		
    		int choice = sc.nextInt();
    		
    		
    		switch(choice) {
    		
    		case 1:t.login();
    		break;
    		
    		case 2:t.ShowBuses();
    		break;
    		
    		case 3:t.Delete();
    		break;
    		
    		case 4:t.UpdateInfo();
    		break;
    		
    		case 5:System.out.println("Thank You For your participation");
    		flag=false;
    		break;
    		
    		default:System.out.println("You are out of choice");
    		break;
    		
    		}
    	}
    }
}
