package com.objectdiagram.schoolsresultapplication;

public class GradeCalculator {
	    public int calculateTotal(Student student) {
	        int total = 0;
	        for (Subject s : student.getSubjects()) {
	            total += s.getMarks();
	        }
	        return total;
	    }

	    public double calculatePercentage(Student student) {
	        int total = calculateTotal(student);
	        return total / (double) student.getSubjects().size();
	    }

	    public String calculateGrade(Student student) {
	        double percentage = calculatePercentage(student);

	        if (percentage >= 90)
	            return "A";
	        else if (percentage >= 75)
	            return "B";
	        else if (percentage >= 60)
	            return "C";
	        else
	            return "Fail";
	    }

}
