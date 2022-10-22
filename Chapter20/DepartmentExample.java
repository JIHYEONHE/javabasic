package Chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class DepartmentExample {
public static void main(String[] args) throws Exception {
	//접속
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc03", "java");
	Statement statement = connection.createStatement();
	//쿼리
	ResultSet resultSet = statement.executeQuery("select dept_id,dept_name,dept_tel from department");
	//결과 
	while(resultSet.next()) {
		String deptId = resultSet.getString("dept_id");
		String deptName = resultSet.getString("dept_name");
		String deptTel = resultSet.getString("dept_tel");
		System.out.printf("%s\t%7s\t%s\n",deptId,deptName,deptTel);
	}
	resultSet.close();
	statement.close();
	connection.close();
	
}
}
