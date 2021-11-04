package Stepic;
//эта задача с сайта степик
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int value = 12;
        BigInteger num = BigInteger.ONE;
        for(int i=1;i<=value;i++){
            num = num.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial numeric " + value + " is " + num);
    }
}
