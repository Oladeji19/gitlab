import java.util.Scanner;

public class App {
    public static void main(String [] args) {
        String q1 = "What color is blood?"
                + "\n(a)red\n(b)Green\n(c)Purple\n(d)White";
        String q2 = "How old is Lebron James?"
                + "\n(a)29\n(b)32\n(c)37)\n(d)35";
        String q3 ="Who is the richest man in the world in 2020?"
                + "\n(a)Bill Gates\n(b)Warren Buffett\n(c)Jeff Bezos\n(d)Mark Zuckerberg";
        String q4 = "When was the first car made in the US?"
                + "\n(a)1841\n(b)1893\n(c)1885\n(d)1857";
        String q5 = "What nationality was Christopher Columbus?"
                + "\na(a)Spanish\n(b)German\n(c)French\n(d)Italian";
        Question [] questions = {
                new Question(q1, "a"),
                new Question(q2, "d"),
                new Question(q3, "c"),
                new Question(q4, "b"),
                new Question(q5, "d")


        };
        takeTest(questions);






    }

    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)) {
                score++;
            }
        }

        System.out.println("Your score is "+ score + "/" + questions.length);



    }


}




