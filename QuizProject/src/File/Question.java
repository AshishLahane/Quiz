package File;

public class Question {


		private int id;
		private String Question;
		private String opt1; 
		private String opt2;
		private String opt3;
		private String opt4;
		private String answer;
		
		
		// generate constructor 
		
		public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
			super();
			this.id = id;
			this.Question = question;
			this.opt1 = opt1;
			this.opt2 = opt2;
			this.opt3 = opt3;
			this.opt4 = opt4;
			this.answer = answer;
		}
		
		// generate getter setter
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQuestion() {
			return Question;
		}
		public void setQuestion(String question) {
			Question = question;
		}
		public String getOpt1() {
			return opt1;
		}
		public void setOpt1(String opt1) {
			this.opt1 = opt1;
		}
		public String getOpt2() {
			return opt2;
		}
		public void setOpt2(String opt2) {
			this.opt2 = opt2;
		}
		public String getOpt3() {
			return opt3;
		}
		public void setOpt3(String opt3) {
			this.opt3 = opt3;
		}
		public String getOpt4() {
			return opt4;
		}
		public void setOpt4(String opt4) {
			this.opt4 = opt4;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		
		
		
		//generate toSting
		
		@Override
		public String toString() {
			return "Question [id=" + id + ", Question=" + Question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3="
					+ opt3 + ", opt4=" + opt4 + ", answer=" + answer + ", getId()=" + getId() + ", getQuestion()="
					+ getQuestion() + ", getOpt1()=" + getOpt1() + ", getOpt2()=" + getOpt2() + ", getOpt3()="
					+ getOpt3() + ", getOpt4()=" + getOpt4() + ", getAnswer()=" + getAnswer() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
		
		
		
		
		

}