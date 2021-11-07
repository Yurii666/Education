package Stepic;
//this task is 2.3 from the stepik site.
//Implement a method that checks if the given string is a palindrome.
//Madam, I'm Adam!
public class Palindrome {
    public static void main(String[] args) {
         boolean palin=true;
        String text = "Madam, I'm Adam!";
        String line;
        line = text.toLowerCase();
        line = line.replaceAll("[^a-zа-я0-9]","");
        for(int i =0;i<line.length()/2;i++){
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                palin = false;
                break;
            }
        }
        //checking the correctness of the task
        if(palin) {
            System.out.println("text " + text + " is palindrome");
        }else {
            System.out.println("text " + text + " does not palindrome");
        }
    }
}

