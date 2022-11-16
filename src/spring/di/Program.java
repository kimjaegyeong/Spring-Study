package spring.di;

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
		
		// context가 지시서(setting.xml)를 잘 읽었다면, 지시서에 있는 내용에 따라 객체를 생성하고 di까지 해서 ioc컨테이너에 잘 담아두었을 것임.
		// setting.xml에 있는 id를 통해서 꺼내 사용할 수 도 있고, class를 이용할 수도 있음
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam = context.getBean(Exam.class); // Bean객체를 가져오기 
		//이름으로 getBean을 하면, 캐스팅을 해야 함. why? 자료형을 알지 못하니까 context에서 꺼내올 때 object타입으로 꺼내오기 때문에 
		//ExamConsole console = (ExamConsole) context.getBean("console");
		
		//자료형으로 꺼내기, 선호되는 방법  
		ExamConsole console = context.getBean(ExamConsole.class); 
		System.out.println(exam.toString());
		console.print();
	}

}
