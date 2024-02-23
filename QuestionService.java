import java.util.Scanner;

public class QuestionService {
  
  Question [] questions=new Question[5];
  String selection[] = new String[5];
  

  public QuestionService() {
    questions[0]=new Question(1,"What is the capital of India?","Delhi","Mumbai","Kolkata","Chennai","Delhi");
    questions[1]=new Question(2,"What is the capital of France?","Delhi","Mumbai","Paris","Chennai","Paris");
    questions[2]=new Question(3,"What is the capital of USA?","Washington","Mumbai","Kolkata","Chennai","Washington");
    questions[3]=new Question(4,"What is the capital of UK?","Delhi","London","Kolkata","Chennai","London");
    
  }


  public void playQuiz()
{
  int i=0;
  for(Question q:questions)
  {
    if (q == null) {
      break;
    }
    System.out.println("Question No.: "+q.getId());
    System.out.println(q.getQuestion());
    System.out.println("1. "+q.getOpt1());
    System.out.println("2. "+q.getOpt2());
    System.out.println("3. "+q.getOpt3());
    System.out.println("3. "+q.getOpt3());

    Scanner scan=new Scanner(System.in);

    selection[i]=scan.nextLine();
    i++;
  }
  for(String s : selection)
  {
    if (s != null) {
      System.out.println(s);
    }
  }
}
  public void printScore()
  {
    int score=0;
    for(int i=0; i<questions.length; i++){
      Question que=questions[i];
      String answer=que.getAnswer();
      String userAnswer=selection[i];
      if(answer.equals(userAnswer)){
        score++;
      }
      System.out.println("Your score is: "+score+" out of 4.");
    }
  }
}
