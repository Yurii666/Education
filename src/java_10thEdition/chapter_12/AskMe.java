package java_10thEdition.chapter_12;
//enumeration-based decision making program

import java.util.Random;
//list of possible answers
enum Answers { YES, NO, MAYBE, LATER, SOON, NEVER }
class Question{
    Random rand  = new Random();
    Answers ask(){
        int prod = rand.nextInt(100);

        if (prod<15)      { return Answers.MAYBE; }
        else if (prod<30) { return Answers.NO; }
        else if (prod<60) { return Answers.YES; }
        else if (prod<75) { return Answers.LATER; }
        else if (prod<98) { return Answers.SOON; }
        else              { return Answers.NEVER; }
    }
}

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
