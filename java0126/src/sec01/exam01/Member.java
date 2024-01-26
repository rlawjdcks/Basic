package sec01.exam01;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "member객체 " + id;
	}
	
	
	//같다고 하고싶으면 재정의해서 문자열 비교하는거임
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;//강제 형 변환 하는이유
			if (id.equalsIgnoreCase(member.id)) {//equalsIgnoreCase대소문자 가리지않고
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.toLowerCase().hashCode();
	}

	
	
	
}
