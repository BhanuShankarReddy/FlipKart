package org.ass.flipkart.util;

import java.util.Properties;

public class ConnectionUtil 
{
	public static Properties getDbproerties()
	{
		 Properties properties = new Properties();
		 properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		 properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/flipkart");
		 properties.setProperty("hibernate.connection.username", "root");
		 properties.setProperty("hibernate.connection.password", "root");
		 properties.setProperty("hibernate.show_sql", "true");
		 properties.setProperty("hibernate.hmb2ddl.auto", "update");
		 return properties;
		
	}

}
