package com.inheritance.educationalcoursehierarchy;

	class OnlineCourse extends Course {
	    protected String platform;
	    protected boolean isRecorded;

	    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
	        super(courseName, duration);
	        this.platform = platform;
	        this.isRecorded = isRecorded;
	    }

	    @Override
	    void displayDetails() {
	        super.displayDetails();
	        System.out.println("Platform    : " + platform);
	        System.out.println("Recorded    : " + isRecorded);
	    }
	}
