package org.buddha;

import java.util.Date;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------------------------- Test GIT -------------------------------");
		System.out.println("Test01");
		System.out.println("Test02");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test03");
		System.out.println("Test04");

		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (int i=0; i<=100;i++){
			System.out.println("i:"+i);
		}
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date now= new Date();
		System.out.println("Now before:"+now);
		while (!now.toString().contains("30")){
			now= new Date();
		}
		System.out.println("Now after:"+now);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generatted catch block
			e.printStackTrace();
		}
		
		
		while (!now.toString().contains("00")){
			now= new Date();
		}
		System.out.println("Now after:"+now);
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generatted catch block
			e.printStackTrace();
		}
		
		
		while (!now.toString().contains("15")){
			now= new Date();
		}
		System.out.println("Now after:"+now);
		
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generatted catch block
			e.printStackTrace();
		}
		
		
		while (!now.toString().contains("45")){
			now= new Date();
		}
		System.out.println("Now after:"+now);
        
		System.out.println("------------------------------- Fin Test GIT -------------------------------");
		System.out.println("------------------------------- Goodbye !!! -------------------------------");
	}
	
}
