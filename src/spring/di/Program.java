package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GreedExamConsole;

public class Program {

	public static void main(String[] args) {

		/* 스프링에게 지시하는 방법으로 코드를 변경 
		Exam exam = new NewlecExam();
		ExamConsole console = new GreedExamConsole(); //해당 관계를 설정(setting)으로 뺀다. 
		
		console.setExam(exam);
		
		console.print();
	*/
	
		ExamConsole console = ?;
		console.print();
	}

}
