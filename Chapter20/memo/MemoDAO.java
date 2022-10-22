package Chapter20.memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.driver.OracleDriver;

//Data Access Object : 직접 데이터베이스에 접속해서 데이터 처리(데이터를 읽고,수정,등록 등)
public class MemoDAO {
	public List<MemoVO> selectList() throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc03", "java");
		Statement statement = connection.createStatement(); // 워크시트 만들기
		// 문자열 결합
		// 1.+기호로 문자열 결합
		// 2.StringBuilder(StringBuffer) 로 문자열 결합 : 속도가 빠르다
		StringBuilder builder = new StringBuilder(); // 문 밑에 파랭이 넣어주기

		builder.append("SELECT");
		builder.append("    id,");
		builder.append("    title,");
		builder.append("    contents,");
		builder.append("    register_date,");
		builder.append("    modify_date ");
		builder.append("FROM ");
		builder.append("    memo");
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);// 결과를 받음
		List<MemoVO> list = new ArrayList<>();
		// 결과가 : 0 ~ 무한대 -> flux
		while (resultSet.next()) {
			int id = resultSet.getInt("id"); // 컬럼명 또 적기
			String title = resultSet.getString("title");
			String contents = resultSet.getString("contents");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");
			list.add(new MemoVO(id, title, contents, registerDate, modifyDate));
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}

	public MemoVO selectOne(int searchId) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc03", "java");
		Statement statement = connection.createStatement(); // 워크시트 만들기
		// 문자열 결합
		// 1.+기호로 문자열 결합
		// 2.StringBuilder(StringBuffer) 로 문자열 결합 : 속도가 빠르다
		StringBuilder builder = new StringBuilder(); // 문 밑에 파랭이 넣어주기
		builder.append("SELECT");
		builder.append("    id,");
		builder.append("    title,");
		builder.append("    contents,");
		builder.append("    register_date,");
		builder.append("    modify_date ");
		builder.append("FROM ");
		builder.append("    memo ");
		builder.append("WHERE ");
		builder.append("   id = " + searchId);
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		// 결과: 0 or 1 -> Mono
		MemoVO vo = null;
		if (resultSet.next()) {
			int id = resultSet.getInt("id"); // 컬럼명 또 적기
			String title = resultSet.getString("title");
			String contents = resultSet.getString("contents");
			Date registerDate = resultSet.getDate("register_date");
			Date modifyDate = resultSet.getDate("modify_date");
			vo = new MemoVO(id, title, contents, registerDate, modifyDate);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return vo;
	}

	public int insertMemo(MemoVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc03", "java");
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO memo (" );
		builder.append(" id," );
		builder.append(" title," );
		builder.append(" contents" );
		builder.append(") VALUES (" );
		builder.append("memo_seq.nextval," );
		builder.append(" ?," );
		builder.append(" ? " );
		builder.append(") " );
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle()); // 1번째 물음표를 문자 바꿔치기
		statement.setString(2, vo.getContents()); // 2번째 물음표에 문자 바꿔치기
		//insert,update,delete 가 모두 executeUpdate()메소드를 호출
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
	}
	public int updateMemo() {
		return 0;
	}

	public int deleteMemo() {
		return 0;
	}


public int updateMemo(MemoVO vo)throws Exception{
	DriverManager.registerDriver(new OracleDriver());
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc03", "java");
	StringBuilder builder = new StringBuilder();
	builder.append("UPDATE memo" );
	builder.append(" SET " );
	builder.append("  title = ?, " );
	builder.append("  contents = ?, " );
	builder.append("  modify_date = SYSDATE " );
	builder.append(" WHERE " );
	builder.append("  id = ? " );
	String sql = builder.toString();
	PreparedStatement statement = connection.prepareStatement(sql);
	statement.setString(1, vo.getTitle()); // 1번째 물음표를 문자 바꿔치기
	statement.setString(2, vo.getContents()); // 2번째 물음표에 문자 바꿔치기
	statement.setInt(3, vo.getId());
	//insert,update,delete 가 모두 executeUpdate()메소드를 호출
	int executeUpdate = statement.executeUpdate();
	statement.close();
	connection.close();
	return executeUpdate;
}
public int deleteMemo(int deleteId)throws Exception {
	DriverManager.registerDriver(new OracleDriver());
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "pc03", "java");
	StringBuilder builder = new StringBuilder();
	builder.append("DELETE FROM " );
	builder.append(" memo " );
	builder.append(" WHERE " );
	builder.append(" id = ?  " );

	String sql = builder.toString();
	PreparedStatement statement = connection.prepareStatement(sql);
	statement.setInt(1, deleteId); // 1번째 물음표를 문자 바꿔치기

	//insert,update,delete 가 모두 executeUpdate()메소드를 호출
	int executeUpdate = statement.executeUpdate();
	statement.close();
	connection.close();
	return executeUpdate;
}
}