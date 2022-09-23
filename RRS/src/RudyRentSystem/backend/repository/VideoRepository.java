package RudyRentSystem.backend.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import RudyRentSystem.util.JDBCUtil;

public class VideoRepository {
	public int createVideo( String name , String serial) throws SQLException, IOException {
		
		String sql = "INSERT INTO `Video`(`name`, serial) VALUES (?,?)";

		try (Connection connection = JDBCUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			preparedStatement.setString(1, name);
			
			preparedStatement.setString(2, serial);
			int error = preparedStatement.executeUpdate();

		}

		return 0;
	}
}
