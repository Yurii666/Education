package Stepic;
//эта задача с сайта степик
public class Palindrome {
    public static void main(String[] args) {
         boolean palin=true;
        String text = "Madam, I'm Adam!";
        String text1 = "";
        text1 = text.toLowerCase();
        text1 = text1.replaceAll("[^a-zа-я0-9]","");
        for(int i =0;i<text1.length()/2;i++){
            if (text1.charAt(i) != text1.charAt(text1.length() - i - 1)) {
                palin = false;
                break;
            }
        }
        //return palin;
        if(palin)
        System.out.println("text " + text + " is palindrome");
        else
        System.out.println("text " + text + " does not palindrome");
    }
}

