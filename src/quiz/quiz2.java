package quiz;

//다운캐스팅

public class quiz2 {
	public static void main(String[] args) {
		//부모타입에 자식 객체를 담을 수 있음 (Object는 모든 객체의 부모)
		//단 자식 객체의 정보를 가져오기 위해서는 부모 타입의 객체를 자식 객체로 다운캐스팅을 통해
		//호출해주어야 함.
		Object obj = new Student(123, "또치");

		if (obj instanceof Student) {
			Student s = (Student) obj;

			System.out.println(s.id);
			System.out.println(s.name);
		}

	}
}

class Student {
	int id;
	String name;

	// 생성자
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student student = (Student) obj;

			if (this.id == student.id) {
				return true;
			}
		}
		return false;

	}

}
