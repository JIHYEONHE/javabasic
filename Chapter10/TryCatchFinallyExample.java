package Chapter10;
//일반예외는 무조건 try,catch 로 묶어야하고 runtime에러는 안묶어도됌 
public class TryCatchFinallyExample {                                    //스프링프레임워크 쓸대는 throws Exception 써서 프레임워크에 에외들을 던짐
	public static void main(String[] args) throws ClassNotFoundException { // 메인메소드 에게 예외떠넘기기
		//2.throws exception
		Class.forName("java.lang.String2");
		
		//1.try catch  catch에서 처리
//		try {
//			Class.forName("java.lang.String2");
//			throw new Exception(); //개발자 본인이 던진거라서 throws 아닌 throw  
//		} catch (ClassNotFoundException e) { //에러에 대한 정보를 받겠다 바꿀필요x
//			System.err.println("클래스가 존재하지 않습니다.");
//		} catch (Exception e) { //throw 한걸 여기서 catch
//		System.err.println("에러가 발생했습니다.");
//		}
//		run();
//		}
	}
	
}
