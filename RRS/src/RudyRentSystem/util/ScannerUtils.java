package RudyRentSystem.util;

import java.util.Scanner;

public class ScannerUtils {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static String inputSerial() {
		while(true) {
			String serial = scanner.nextLine().trim();
			if(serial.isEmpty()) {
				System.out.println();
			}else {
				return serial;
			}
		}
	}
	
	public static String inputName() {
		while(true) {
			String name = scanner.nextLine().trim();
			if(name.isEmpty()) {
				System.out.println();
			}else {
				return name;
			}
		}
	}
	
	public static int inputPositiveInt() {
		while(true) {
			try {
				int a = Integer.parseInt(scanner.nextLine());
				if(a < 0) {
					System.out.println("errorMessage");
				}
				return a;
			} catch (NumberFormatException e) {
				System.out.println("errorMessage");
			}
		}
	}
	
	public static int inputInt(String errorMessage) {
		while(true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
			}
		}
	}
	
	
	public static String inputString() {
		while(true) {
			String text = scanner.nextLine().trim();
			if(text.isEmpty()) {
				System.out.println("errorMessage");
			}else {
				return text;
			}
		}
	}
}
