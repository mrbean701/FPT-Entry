package RudyRentSystem.backend.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import RudyRentSystem.entity.Thing;
import RudyRentSystem.util.JDBCUtil;

public class ThingRepository {

	private JDBCUtil jdbcUtil;

	public ThingRepository() {

		jdbcUtil = new JDBCUtil();
	}

	public int getDescription(String serial) throws IOException, SQLException {

		String sql = "SELECT v.id, v.`name`, v.createDate, v.`serial` FROM  `Video` v  WHERE v.`serial` = ?\r\n"
				+ "UNION\r\n"
				+ "SELECT b.id, b.`name`, b.createDate, b.`serial` FROM  `BookOnTape` b WHERE b.`serial` = ?\r\n"
				+ "UNION\r\n"
				+ "SELECT f.id, f.`name`, f.createDate, f.`serial` FROM  `Furniture` f  WHERE f.`serial` = ?;";
		try (Connection connection = jdbcUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			preparedStatement.setString(1, serial);
			preparedStatement.setString(2, serial);
			preparedStatement.setString(3, serial);
			try (ResultSet resultSet = preparedStatement.executeQuery()) {

//				if(resultSet.next()) {
//					int id = resultSet.getInt("idThing");
//					String name = resultSet.getString("name");
//					Date createDate = resultSet.getDate("createDate");
//					
//					
//					
//					return null ;
//				}

				while (resultSet.next()) {
//					System.out.println("id: " + resultSet.getInt("id"));
//					System.out.println("name: " + resultSet.getString("name"));
//					System.out.println("serial: " + resultSet.getString("serial"));
//					System.out.println("create date: " + resultSet.getDate("createDate"));
					System.out.printf("| %-4s | %-15s | %-15s |%-20s |%n", resultSet.getInt("id"), resultSet.getString("name"), resultSet.getDate("createDate"), resultSet.getString("serial"));
				}
			}
		}

		return 0;
	}

	public Thing getAllThing() throws SQLException, IOException {
		String sql = "SELECT * FROM Video\r\n" + "UNION\r\n" + "SELECT * FROM BookOnTape\r\n" + "UNION\r\n"
				+ "SELECT * FROM Furniture\r\n" + ";";
		
		try (Connection connection = jdbcUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {
			try(ResultSet resultSet = preparedStatement.executeQuery()){
				while(resultSet.next()) {
//					System.out.print("  " + resultSet.getInt("id"));
//					System.out.print("\t" + resultSet.getString("name"));
//					System.out.print("\t" + resultSet.getDate("createDate"));
//					System.out.print("\t" + resultSet.getString("serial") + "\n");
					
					System.out.printf("| %-4s | %-15s | %-15s |%-20s |%n", resultSet.getInt("id"), resultSet.getString("name"), resultSet.getDate("createDate"), resultSet.getString("serial"));
				}
			}
		}
		return null;
	}
}
