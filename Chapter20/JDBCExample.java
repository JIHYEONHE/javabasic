package Chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JDBCExample {
public static void main(String[] args) throws Exception {
	//JDBC(Java Data Base Connectivity)  자바에서 사용하는 데이터베이스 연결
	/*0. 준비물
	JDBC Driver
	Oracle JDBC => ojdbc.jar 드라이버 파일 필요
	1.오라클 드라이버를 로딩 
	2.접속 정보를 통해 접속
	3.쿼리를 전송
	4.뭐리 결과 받기
	5.리소스 닫기
    */
	//1.드라이버 로딩
	//1-1. reflection 기법을 사용한 드라이버 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
    //1-2. DriverManager 클래스를 이용하여 드라이버 로딩
	//DriverManager.registerDriver(new OracleDriver());
	
	//2.접속 정보를 통해 데이터베이스 접속
	//127.0.0.1 == localhost // 내 ip써도됌 192.168.142.8
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc03", "java");
	
	//3.쿼리를 작성 (sqldeveloper의 워크시트 생성)
	Statement statement = connection.createStatement(); 
	//4.쿼리 전송 후 결과 받기 (sqldeveloper 에서 쿼리되는지 확인하고 java에서 하기) 
	ResultSet resultSet = statement.executeQuery("select mem_id,mem_name,mem_hp,mem_mail from member");
	//5.결과 분석(Parsing)
	while(resultSet.next()) {
		String memId = resultSet.getString("mem_id");
		String memName = resultSet.getString("mem_name");
		String memHp = resultSet.getString("mem_hp");
		String memMail = resultSet.getString("mem_mail");
		System.out.printf("%s \t %s \t %s \t %s\n",memId,memName,memHp,memMail);
	}
	//6.자원 반납 !! connection statement resultset
	resultSet.close();
	statement.close();
	connection.close();

}

}
