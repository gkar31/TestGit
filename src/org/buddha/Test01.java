package org.buddha;

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
		
	}

}
