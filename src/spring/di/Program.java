package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GreedExamConsole;

public class Program {

	public static void main(String[] args) {

		/* 스프링에게 지시하는 방법으로 코드를 변경 
		Exam exam = new NewlecExam();
		
		//생성자 DI
		Exam exam = new NewlecExam(10,10,10,10);
		
		ExamConsole console = new GreedExamConsole(); //해당 관계를 설정(setting)으로 뺀다. 
		
		console.setExam(exam);
		
		console.print();
	*/
	
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam = context.getBean(Exam.class);
		ExamConsole console = context.getBean(ExamConsole.class); 
		//console.print();
		
		//콜렉션 생성과 목록 DI. arrayList를 xml에서 생성하여 값을 초기과할 수 있는 방법을 배움
		
		//List<Exam> exams= new ArrayList<>(); 
		List<Exam> exams = (List<Exam>) context.getBean("exams");
		/*context.getBean("exams")가 new ArrayList<>()와 같은 역할을 하는 이유는 
		setting.xml 에 exams라는 id의 bean 객체에 class="java.util.ArrayList" 
		으로 지정이 되어 있기 때문이다. 
		*/
		exams.add(new NewlecExam(1,1,1,1));
		
		
		for(Exam e : exams) {
			System.out.println(e);
		}
	}

}
