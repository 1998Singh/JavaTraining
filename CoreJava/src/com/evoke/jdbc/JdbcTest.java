package com.evoke.jdbc;

public class JdbcTest {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/Test_DB";
		String userName = "postgres";
		String password = "123456";
		String driverName = "org.postgresql.Driver";

//		String sql1 = "INSERT INTO public.car1(\r\n" + "	rc_no, car_name, model, car_price, car_speed)\r\n"
//				+ "	VALUES (126,'Nexon','XZ+',1000000,250);";
//
		String sql2 = "INSERT INTO public.car1(\r\n" + "	rc_no, car_name, model, car_price, car_speed)\r\n"
				+ "	VALUES (127,'Mahindra','SUV300',1500000,280);";

		String updatesql = "UPDATE public.car1\r\n" + "	SET  car_price=40000000\r\n" + "	WHERE rc_no = 124;";

	//	String deletesql = "DELETE FROM public.car1\r\n" + "	WHERE rc_no = 127;";

		
		JdbcConfig config = new JdbcConfig();
		config.connect(url, userName, password, driverName);

//		config.insert(sql1);
		config.insert(sql2);
		config.updateCar(updatesql);
		//config.delete(deletesql);

	}

}
