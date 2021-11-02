package Stepic;

public class Palindrome {
    public static void main(String[] args) {
         boolean palin;
        String text = "Madam, I'm Adam!";
        text = text.toLowerCase();
        text = text.replaceAll("[^a-zа-я0-9]","");
        for(int i =0;i<text.length()/2;i++){
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                palin = false;
                break;
            }
        }
        //return palin;
    }
}

