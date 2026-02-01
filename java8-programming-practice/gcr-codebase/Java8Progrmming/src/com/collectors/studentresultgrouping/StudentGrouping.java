package com.collectors.studentresultgrouping;
import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping {
	 public static void main(String[] args) {

	        List<Student> students = List.of(
	            new Student("Surbhi", "A"),
	            new Student("Subh", "B"),
	            new Student("Deep", "A"),
	            new Student("Yuvi", "C"),
	            new Student("Saurabh", "B")
	        );

	        Map<String, List<String>> result =
	            students.stream()
	                    .collect(Collectors.groupingBy(
	                        Student::getGrade,
	                        Collectors.mapping(Student::getName, Collectors.toList())
	                    ));

	        System.out.println(result);
	    }

}
