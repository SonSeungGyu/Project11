package object;

public class Ex3 {
	public static void main(String[] args) {

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");

		if (student1 == student2) {
			System.out.println("stu1와 stu2의 주소는 같다");
		} else {
			System.out.println("stu1와 stu2의 주소는 다르다");
		}

		if (student1.equals(student2)) {
			System.out.println("stu1와 stu2는 같은 학생이다");
		} else {
			System.out.println("stu1와 stu2는 다른 학생이다");
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
		// 학생의 학번이 같으면 참, 그렇지 않으면 거짓 반환

		// 나의 학번 == obj의 학번 비교
		// 모든 자식 클래스는 부모타입으로 현변환 가능

		// obj의 실제 타입이 Student인지 확인
		if (obj instanceof Student) {
			Student student = (Student) obj;

			if (this.id == student.id) {
				return true;
			}
		}
		return false;

	}

}
