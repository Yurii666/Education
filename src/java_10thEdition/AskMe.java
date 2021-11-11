package java_10thEdition;

import java.util.Random;

interface SharedConstants{
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEWER = 5;
}
class Question implements SharedConstants{
    Random rand = new Random();
    int ask(){
        int prod = rand.nextInt(100);
        if(prod<30) {
            return NO;
        }
        else if (prod<60) {
            return YES;
        }
        else if (prod<75) {
            return LATER;
        }
        else if (prod<98){
            return SOON;
        }
        else {
            return NEWER;
        }
    }
}
 class AskMe implements SharedConstants{
    static void ansver(int result){
        switch (result) {
            case NO:
                System.out.println("no");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEWER:
                System.out.println("newer");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
     public static void main(String[] args) {
         Question q = new Question();

         ansver(q.ask());
         ansver(q.ask());
         ansver(q.ask());
         ansver(q.ask());
     }
}
