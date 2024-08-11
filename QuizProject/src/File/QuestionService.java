package File;

import java.security.PublicKey;
import java.util.Scanner;

public class QuestionService {

	
		
		Question[] question = new Question[5];
		String select[] = new String[5];
		
		public QuestionService() {
			
			//question[0]= new Question("Question", "opt1","op2","opt3","opt4", "answer");

			
			question[0]= new Question(1, " Which is fev language ? ", "java","cpp","c","python", "a");
			question[1]= new Question(2, " A leap year has _____ days ?" , "365", "366", "345", "367", "b");
			question[2]= new Question(3, " _____ is known as the brain of the computer ?.", "Mouce","Cpu","Keyboard","Monitor","b");
			question[3]= new Question(4, " Which part of the human body has the smallest bone ?","Brain","Toung","Ear","Nose","c");
			question[4]= new Question(5, "Which is the most sensitive organ in the human body ?","Leg","Brain","Mouth","Skin","d");
		}
		
		public void playQuiz()
		{
			int i = 0;
			for(Question q : question) {
			System.out.print("Q" + q.getId() + ".");
			System.out.println( q.getQuestion());
			System.out.println("\na. " + q.getOpt1());
			System.out.println("b. "+ q.getOpt2());
			System.out.println("c. " +q.getOpt3());
			System.out.println("d. " +q.getOpt4());

			
			// for getting the input from user 
			Scanner sc= new Scanner(System.in);
			select[i] = sc.nextLine();	
			i++;
			
			
//			for(String s: select) {
//			System.out.println(s);
//			
//			}
			
			}
		}
		
		public void printScore() {
			
			int score=0;   //for storing score 
			
			for(int i=0; i<question.length;i++)
			{
				
				
				Question que = question[i];
				String Actualans = que.getAnswer();			 // actual answer
				
				String UserAns = select[i]; 				// which opt user selected 
				
				//equal method tom compare string
				
				if(Actualans.equals(UserAns))
				{
					score++;
				}
				//System.out.println("Your score is: " + score);

			}
			System.out.println("Your score is: " + score);
			
			if(score>=3) {
				System.out.println("Congrotulation you are pass🔥🔥🔥🔥🔥!!!!!!!");
			}
			else {
				System.out.println("Sorry you are fail😔😔😔😔!!!! \n Better luck next time💯💯💯💯  ");
			}

		}
		

	
}
