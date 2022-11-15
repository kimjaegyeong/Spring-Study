package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GreedExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		//Exam 은 interface로, 어떤 객체를 생성하는지에 따라 자료형이 바뀌는 문제를 해결한다. 
		Exam exam = new NewlecExam();
		
		//ExamConsole은 부품으로 exam을 받는다.(di)
		//이렇게 interface로 정의해서 사용하면 코드의 변경이 필요할 때 new 선언부만 변경하면 된다.
		
		//용도에 따라 객체를 다르게 생성하는데, 이때 console이라는 자료형은 같되, new를 통해 생성하는 객체만 바뀌게 된다. 
		//이때 객체의 변화 코드 부분을 spring에서 처리해줄 수 있다. 
		
		//ExamConsole console = new InlineExamConsole(exam);
		ExamConsole console = new GreedExamConsole();
		console.setExam(exam);
		
		console.print();
	}

}
