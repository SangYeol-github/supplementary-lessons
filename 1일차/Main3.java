package chap01;

public class Main3 {

	public static void main(String[] args) {
		
//		Student 인스턴스를 생성하여 리턴하는 메소드 작성(getStudent())
//		위에서 리턴된 Student 객체를 받아서 그 내용을 화면서 표시(printStudent())
		
//		updateStudent(student, 새전화, 학년);
		Student st = getStudent();
//		updateStudent(st, "010-4567-8901", 3);
		updateStudent(st);
//		printStudent(st);
		printStudent(updateStudent(st));
	}

	private static Student updateStudent(Student st) {
		
		st.setPhone("010-4567-8901");
		st.setYear(3);
		return st;
		
	}



	private static void printStudent(Student st) {
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getPhone());
		System.out.println(st.getYear());
		
	}

	private static Student getStudent() {
		Student st = new Student();
		st.setId(1);
		st.setName("park");
		st.setPhone("010-1234-5678");
		st.setYear(2);
		return st;
		
	}

}
