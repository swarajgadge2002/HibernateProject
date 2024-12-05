package com.Advanto.Implemented;


import java.util.Date;
//import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Advanto.Configuration.Connection;
import com.Advanto.Entity.Buses;
import com.Advanto.Entity.RegisterUser;
import com.Advanto.Entity.User;
import com.Advanto.Unimplemented.TRPInterface;

public class TRPClass implements TRPInterface {
	
	
	Scanner sc=new Scanner(System.in);
	SessionFactory sf = Connection.connect();

	
	public void login() {
		
		System.out.println("Enter Your Name");
		String n =sc.next();
		
		System.out.println("Enter Your Contact No");
		long c=sc.nextLong();
		
		System.out.println("Enter Your Email");
		String e = sc.next();
		
		System.out.println("Enter Your Password");
		String p = sc.next();
		
		User u1=new User();
		u1.setId(1);
		u1.setUname(n);
		u1.setContact_no(c);
		u1.setEmail(e);
		u1.setPassword(p);
		
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(u1);
		
		System.out.println("U have Been Registerd Successfully");
		
		tx.commit();
		session.close();
		sf.close();
		
		
	}

	
	public void insert_Buses() {
		
		Buses b1 =new Buses(1,"Shivai","MH 09 5342","Seater");
		Buses b2 =new Buses(2,"Shishahi","MH 14 5672","Sleeper");
		Buses b3 =new Buses(3,"Hirkani","MH 12 3349","Standing");
		Buses b4=new Buses(4,"SWraj","MH 43 2876","Seater/Sleeper");
		Buses b5 =new Buses(5,"RedBus","MH 17 5342","Seater/Sleeper");
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		session.save(b5);
		
		tx.commit();
		session.close();
		sf.close();
		
	}
	
	
	
	public void Delete() {
		
		System.out.println("Enter Your aadhar Number:");
		int a=sc.nextInt();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		RegisterUser ru = session.get(RegisterUser.class, a);
		session.delete(ru);
		
		tx.commit();
		session.close();
		sf.close();
		
		
		
	}

	
	public User UpdateInfo() {
		
		System.out.println("Enter Info for updation");
				
		System.out.println("Enter Your Aadhar Number");
		int a=sc.nextInt();
		
		Session session= sf.openSession();
		Transaction tx= session.beginTransaction();
		RegisterUser user = session.get(RegisterUser.class, a);
		
		
		boolean flag=true;
		
		while (flag) {
			System.out.println("1] Update Name");
			System.out.println("2] Update Age");
			System.out.println("3] Update Date");
			System.out.println("4] Update Destination Point");
			System.out.println("5] Update Boarding Point");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1 : System.out.println("Enter Your Name");
			String n =sc.next();
			user.setName(n);
			session.update(user);
			
			tx.commit();
			session.close();
			break;
			
			
			case 2 : System.out.println("Enter Your Age");
			int age =sc.nextInt();
			user.setAge(age);
			session.update(user);
			
			tx.commit();
			session.close();
			break;
			
			case 3 :System.out.println("Enter your year:");
            int year = sc.nextInt() - 1900;

            System.out.println("Enter your month:");
            int month = sc.nextInt();

            System.out.println("Enter your day:");
            int day = sc.nextInt();

            Date date = new Date(year, month, day);
            user.setDateofdeparture(date);
            
			tx.commit();
			session.close();
			break;
			
			
		    case 4:
                System.out.println("Enter your new boarding point:");
                String boardingPoint = sc.next();
                user.setBoardingpoint(boardingPoint);
                session.update(user);
                
                tx.commit();
    			session.close();
                break;
			
                
            case 5:
                System.out.println("Enter your new destination point:");
                String destinationPoint = sc.next();
                user.setDestinationPoint(destinationPoint);
                session.update(user);
                
                tx.commit();
    			session.close();
                break;
                
            case 6:
                flag = false;
                continue;

            default:
                System.out.println("Invalid choice. Please try again.");
                continue;


			
			}
			
			
		}
		
		
		
		return null;
	}


	@Override
	public void ShowBuses() {
Session session = sf.openSession();
		
		Criteria c1 = session.createCriteria(Buses.class);
		List<Buses> l1 =c1.list();
		for(Buses res : l1) {
			
			System.out.println(res);
		}
		System.out.println("Are You Want To Reserve ticket: True/False");
		boolean option=sc.nextBoolean();
		
		if (option) {
			bookBus();
		}else {
			
			System.out.println("Thank You For your Co-Operation");
		}
		session.close();
		sf.close();
		
		
		
	}
	
	public void bookBus() {
		System.out.println("----Enter Your Bus Choice-----");
		int choice =sc.nextInt();
		
		System.out.println("----Enter Your Aadhar No-----");
		int aadhar=sc.nextInt();
		
		System.out.println("-----Enter Your Name----");
		String n=sc.next();
		
		System.out.println("----Enter Your Age------");
		int a=sc.nextInt();
		
		System.out.println("----Boarding POint---");
		String b=sc.next();
		
		System.out.println("---Destination Point---");
		String d = sc.next();
		
		System.out.println("Enter Date of Depature");
		System.out.println("Enter your year");
		int y = sc .nextInt();
		y=y-1900;
		
		System.out.println("Enter month");
		int m = sc.nextInt();
		
		System.out.println("Enter date");
		int d1 = sc.nextInt();
		
		Date date = new Date(y, m, d1);
		
		System.out.println("Enter your Payment Status ");
		boolean status = sc.nextBoolean();
		
		RegisterUser ru = new RegisterUser(aadhar,n,a,b,d,date,status);
		
		Session session= sf.openSession();
		Transaction tx= session.beginTransaction();
		
		session.save(ru);
		
		RegisterUser ticket = session.get(RegisterUser.class, aadhar);
		
		System.out.println("-----Ticket Details----");
		System.out.println(ticket.getName());
		System.out.println(ticket.getAge());
		System.out.println(ticket.getAadharno());
		System.out.println(ticket.getBoardingpoint());
		System.out.println(ticket.getDateofdeparture());
		
		System.out.println("Thank you for your Selecting Our Bus ");
		
		tx.commit();
		session.close();
		sf.close();
		
	}


	
	
}
