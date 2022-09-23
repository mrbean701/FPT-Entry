package Test;

import java.io.IOException;
import java.sql.SQLException;

import RudyRentSystem.backend.repository.ThingRepository;
import RudyRentSystem.util.ScannerUtils;

public class ProgramTest {
	public static void main(String[] args) throws IOException, SQLException {
		ThingRepository repository = new ThingRepository();
		ScannerUtils scannerUtils = new ScannerUtils();
		String serial = scannerUtils.inputSerial();
		repository.getDescription(serial);
	}
}
