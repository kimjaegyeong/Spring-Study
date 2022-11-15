package spring.di.ui;

import spring.di.entity.Exam;

public class GreedExamConsole implements ExamConsole {
	private Exam exam;
	
	public GreedExamConsole() {
		
	}
	public GreedExamConsole(Exam exam) {
		this.exam= exam; 
	}
	@Override
	public void print() {
		System.out.println("total is "+ exam.total());
		System.out.println("avg is "+ exam.avg());

	}
	@Override
	public void setExam(Exam exam) {
		this.exam= exam; 
		
	}

}
