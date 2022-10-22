package Chapter11;

import java.util.Objects;

//Value Object(데이터를 저장하는 객체)
public class Member {
	private String id;
	private String name;
	private int mileage;

	public Member(String id, String name, int mileage) {
		this.id = id;
		this.name = name;
		this.mileage = mileage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name); //hash가 들어간 클래스들은Override한 것을 보고 hashcode같은지 보고->equals까지 같은지 확인
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
		
		
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", mileage=" + mileage + "]";
	}
	
	
	

//	@Override
//	public boolean equals(Object obj) {
//		if (this==obj) {
//			return true;
//		}
//		if(!(obj instanceof Member)) {
//			return false; //member타입으로 캐스팅 할수없으면 false
//		}
//		Member member = (Member)obj;  //member로 캐스팅 할수 있을때 아이디와 이름이 같으면  true
//		if(this.id.equals(member.id)
//				&&this.name.equals(member.name)) {
//			return true;
//		}
//		return false;
//	}

}
