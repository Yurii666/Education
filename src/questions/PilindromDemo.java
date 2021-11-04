package questions;
// сделал все, что мог))
class Numeric {
    String value;
    Boolean palin = true;
    Boolean isString = false;

    Numeric(int b) {
        value = b + "";
    }

    Numeric(String b) {
        value = b;
        isString = true;
    }

    void pilindrom() {
        System.out.println(value);
        String valuePal;
        if(isString){
            String expression = value.toLowerCase();
            expression = expression.replaceAll("[^a-zа-я0-9]","");
            System.out.println(expression);
            valuePal = expression;
        }else{
            valuePal = value;
        }
        for (int i = 0; i < (valuePal.length() / 2); i++) {
            if (valuePal.charAt(i) != valuePal.charAt(valuePal.length() - i - 1)) {
                palin = false;
                break;
            }
        }
        if(palin){
            System.out.println(value+"- is Palindrome");
        }else{
        System.out.println(value+"- is not Palindrome");}
    }
    void sumnum() {
        if(isString){
            System.out.println("It is not numeric");
        }else {
            int sum = 0;
            if (value.charAt(0) == '-') {
                for (int i = 1; i < value.length(); i++) {
                    int i1 = Integer.parseInt(String.valueOf(value.charAt(i)));
                    sum = sum + i1;
                }
            } else {
                for (int i = 0; i < value.length(); i++) {
                    int i1 = Integer.parseInt(String.valueOf(value.charAt(i)));
                    sum = sum + i1;
                }
            }
            System.out.println("сумма цифр в числе " + value + " равна " + sum);
            if (sum % 2 == 0) {
                System.out.println(sum + " - это четное число");
            } else {
                System.out.println(sum + " - это не четное число");
            }
            if (Integer.parseInt(String.valueOf(value)) % 2 == 0) {
                System.out.println(value + " - это четное число");
            } else {
                System.out.println(value + " - это не четное число");
            }
        }
    }
}

class PilindromDemo {
    public static void main(String[] args) {
    /*int numer = 0;
         Numeric pil = new Numeric(numer);
         pil.pilindrom();
         pil.sumnum();*/

    /*String lim = "радар";
          Numeric limi = new Numeric(lim);
          limi.pilindrom();
          limi.sumnum();*/

        String lim = "Madam, I'm Adam";
        Numeric limi = new Numeric(lim);
        limi.pilindrom();
        limi.sumnum();
    }
}
