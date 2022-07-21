package com.evoke.jdbc;

public class TestPreparedstm {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/Test_DB";
		String userName = "postgres";
		String password = "123456";
		String driverName = "org.postgresql.Driver";

		String sql = "INSERT INTO public.student(\r\n" + "	roll_no, name, stream, fee, percentage, gender)\r\n"
				+ "	VALUES (?,?,?,?,?,?);";

		PreparedStatementDemo pDemo = new PreparedStatementDemo();
		pDemo.connect(url, userName, password, driverName);

		pDemo.insert(sql);

	}

}
