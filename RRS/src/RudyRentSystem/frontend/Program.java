package RudyRentSystem.frontend;

import java.io.IOException;
import java.sql.SQLException;

import RudyRentSystem.util.ScannerUtils;

public class Program {
	private static final ProgramFunction FUNCTION = new ProgramFunction();
	
	public static void main(String[] args) throws IOException, SQLException {
		while (true) {
			System.out.println("==================================================================");
			System.out.println("=                          MENU                                  =");
			System.out.println("======+===========================================================");
			System.out.println("=  1  | Create new thing                                         =");
			System.out.println("=  2  | Show all                                                 =");
			System.out.println("=  3  | Lookup                                                   =");
			System.out.println("=  4  | Exit                                                     =");
			System.out.println("======+===========================================================");
			int menu = ScannerUtils.inputPositiveInt();

			switch (menu) {
			case 1:
				showMenuCreate();
				break;
			case 2:
				FUNCTION.showAllThing();
				break;
			case 3:
				FUNCTION.Lookup();
				break;
			case 4:
				System.exit(menu);
				break;
				default:
					System.out.println("You have entered wrong, please re-enter!!!");
					break;
			}

		}
	}

	public static void showMenuCreate() {
		while (true) {
			System.out.println("======+===========================================================");
			System.out.println("=  1  | Create new video                                         =");
			System.out.println("=  2  | Create new book on tape                                  =");
			System.out.println("=  3  | Create new furniture                                     =");
			System.out.println("=  4  | Exit                                                     =");
			System.out.println("======+===========================================================");
			
			int menuCreate = ScannerUtils.inputPositiveInt();
			
			switch(menuCreate) {
			case 1:
				FUNCTION.createVideo();
				break;
			case 2:
				FUNCTION.createBookOnTape();
				break;
			case 3:
				FUNCTION.createFurniture();
				break;
			case 4:
				System.exit(menuCreate);
				break;
			default:
				System.out.println("You have entered wrong, please re-enter!!!");
				break;
			}
		}

	}
}
