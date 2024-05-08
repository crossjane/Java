package chap07_class;

import chap07_class.student.Student;

public class _04_UseOfStudent {
	public static void main(String[] args) {
	
		Student std = new Student("김화영",1, "전공");
		
		String[] strArr = new String[5];
		Student[] stdentArr = new Student[5];
		
		stdentArr[0] = new Student("김화영",25, "컴공");
		stdentArr[1] = new Student("임꺽정",22, "산업공학");
		stdentArr[2] = new Student("장길산",27, "수학과");
		
		for(Student st : stdentArr) {
			st.printStudentInfo();
		}
		
		student.printStudentInfo();
	
	}
	
	
	
	}


