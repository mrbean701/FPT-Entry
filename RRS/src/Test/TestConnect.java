package Test;
import java.io.IOException;
import java.sql.SQLException;

import RudyRentSystem.util.JDBCUtil;

public class TestConnect {
	public static void main(String[] args) throws SQLException, IOException {
		JDBCUtil jdbcUtil = new JDBCUtil();
		jdbcUtil.checkDBConnection();
	}
}
