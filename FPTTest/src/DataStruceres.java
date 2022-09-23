import java.util.Scanner;

public class DataStruceres {
	public static void main(String[] args) {
		System.out.println("Nhập vào 1 chuỗi");
		Scanner sc = new Scanner(System.in);
		String input;

		input = sc.nextLine();

		String[] inStrings = input.split(" "); // tách từ sau dấu cách

//		for(int i = 0; i < inStrings.length; i++) {
//			System.out.println(inStrings[i]);
//		}

		int index = 0, lenghmax = 0, temp = 0; // index để lưu vị trí của từ trong chuỗi

		for (int i = 0; i < inStrings.length; i++) {
			temp = inStrings[i].length();
			if (temp > lenghmax) {
				lenghmax = temp;
				index = i;
			}
		}
		System.out.println(inStrings[index] + "\nđộ dài: " + lenghmax);
	}
}
