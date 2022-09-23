package RudyRentSystem.frontend;

import java.io.IOException;
import java.sql.SQLException;

import RudyRentSystem.backend.repository.BookOnTapeRepository;
import RudyRentSystem.backend.repository.FurnitureRepository;
import RudyRentSystem.backend.repository.ThingRepository;
import RudyRentSystem.backend.repository.VideoRepository;
import RudyRentSystem.util.ScannerUtils;

public class ProgramFunction {
	private final VideoRepository videoRepository = new VideoRepository();
	private final BookOnTapeRepository bookOnTapeRepository = new BookOnTapeRepository();
	private final FurnitureRepository furnitureRepository = new FurnitureRepository();
	private final ThingRepository thingRepository = new ThingRepository();
	
	public void showAllThing() throws IOException {
		try {
			
            System.out.println("+======+=================+=================+=====================+");
            System.out.println("+= ID =+=     Name      =+=  Create Date  =+=      Serial       =+");
            System.out.println("+======+=================+=================+=====================+");
            thingRepository.getAllThing();
		} catch (SQLException e) {
			System.out.println("Exception = " + e.getMessage());
		}
	}
	
	
	
	public void createVideo() {
		try {
			System.out.println("Enter a name: ");
			String name = ScannerUtils.inputName();
			System.out.println("Enter a serial");
			String serial = ScannerUtils.inputSerial();
			int error = videoRepository.createVideo(name, serial);
			System.out.printf("Successfully!!!\n", error);
		} catch (Exception e) {
			System.out.println("Exception = " + e.getMessage());
		}
	}
	
	public void createBookOnTape() {
		try {
			System.out.println("Enter a name: ");
			String name = ScannerUtils.inputName();
			System.out.println("Enter a serial");
			String serial = ScannerUtils.inputSerial();
			int error = bookOnTapeRepository.createBookOnTape(name, serial);
			System.out.printf("Successfully!!!\n", error);
		} catch (Exception e) {
			System.out.println("Exception = " + e.getMessage());
		}
	}
	
	public void createFurniture() {
		try {
			System.out.println("Enter a name: ");
			String name = ScannerUtils.inputName();
			System.out.println("Enter a serial");
			String serial = ScannerUtils.inputSerial();
			int error = furnitureRepository.createFurniture(name, serial);
			System.out.printf("Successfully!!!\n", error);
		} catch (Exception e) {
			System.out.println("Exception = " + e.getMessage());
		}
	}
	
	public void Lookup() throws SQLException, IOException{
		try {
			System.out.println("Enter a serial: ");
			String serial = ScannerUtils.inputSerial();
			System.out.println("+======+=================+=================+=====================+");
	        System.out.println("+= ID =+=     Name      =+=  Create Date  =+=      Serial       =+");
	        System.out.println("+======+=================+=================+=====================+");
			thingRepository.getDescription(serial);
		} catch (Exception e) {
			System.out.println("Exeption = " + e.getMessage());
		}
	}
}
