import java.util.Scanner;
public class OnlineQuizApplication{
     public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int score=0;
   
// Questions 
 String [] questions = {

  " Q1. What is the size of an int data type in Java?",
  " Q2. Which keyword is used to prevent inheritance in Java?" ,
  " Q3. Which method is the entry point of a Java program?",
  " Q4. What will be the default value of an instance variable in Java?",
  " Q5. Which of the following cannot be used with static keyword?" 
};

// options
String [][] options ={
            {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) Depends on OS"},
            {"a) static", "b) private", "c) final", "d) protected"},
            {"a) start()", "b) run()", "c) main()", "d) execute()"},
            {"a) Depends on data type", "b) null", "c) 0", "d) Garbage Value"},
            {"a) Variable", "b) Method", "c) Class", "d) Constructor"}
        };

 //answer
char [] answer ={'b' , 'c' ,'c' ,'a', 'd'};
 
  //Quiz
  for(int i=0; i<questions.length;i++){
  System.out.println(questions[i]);
  for(int j=0; j<options[i].length; j++){
  System.out.println(options[i][j]);
  }

  System.out.println("Enter your answer");
  char userAnswer =input.next().toLowerCase().charAt(0);

  switch(userAnswer){
     case 'a':
     case 'b':
     case 'c':
     case 'd':
         if(userAnswer == answer[i]){
          score++;
         System.out.println("Correct answer");
         } else {
         System.out.println("Wrong answer");
         }
         System.out.println("----------------------------------");
          break;
     default:
          System.out.println("Invalid choice");
          System.out.println("----------------------------------");

   }
  }

// score
    System.out.println("====SCORE====");
    System.out.println("Your score is: " + score);
  }
}











 



               