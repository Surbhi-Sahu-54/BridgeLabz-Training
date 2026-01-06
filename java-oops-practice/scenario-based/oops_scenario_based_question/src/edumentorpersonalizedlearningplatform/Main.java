package edumentorpersonalizedlearningplatform;

public class Main {
	    public static void main(String[] args) {

	        Instructor inst = new Instructor(1, "Dr. Mehta", "mehta@edumentor.ai", "AI");
	        inst.printDetails();

	        Learner learner = new Learner(101, "Surbhi", "surbhi@gmail.com");

	        Course shortCourse = new ShortCourse("Java Basics");
	        Course fullCourse = new FullTimeCourse("Data Science");

	        learner.enrollCourse(shortCourse);
	        learner.generateCertificate();

	        learner.enrollCourse(fullCourse);
	        learner.generateCertificate();

	        String[] questions = {"What is Java?", "OOP stands for?"};
	        String[] answers = {"Language", "Object Oriented Programming"};

	        Quiz quiz = new Quiz(questions, answers);
	        String[] userAnswers = {"Language", "Object Oriented Programming"};

	        quiz.evaluate(userAnswers);
	        quiz.showResult();
	    }
}
