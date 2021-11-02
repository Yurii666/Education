package questions;

class Numeric {
    String a;
    Boolean f = true;

    Numeric(int b) {
        a = b + "";
    }

    Numeric(String b) {
        a = b;
    }

    void pilindrom() {
        System.out.println(a);
        for (int i = 0; i < (a.length() / 2); i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                f = false;
                break;
            }
        }
        if(f){
            System.out.println(a+" is Pilindrom");
        }else{
        System.out.println(a+" is not Pilindrom");}
    }
    void sumnum() {
        int sum = 0;
        if(a.charAt(0)=='-') {
            for (int i = 1; i < a.length(); i++) {
                int i1 = Integer.parseInt(String.valueOf(a.charAt(i)));
                sum = sum + i1;
            }
        }else {
            for (int i = 0; i < a.length(); i++) {
                int i1 = Integer.parseInt(String.valueOf(a.charAt(i)));
                sum = sum + i1;
            }
        }
        System.out.println("сумма цифр в числе " + a + " равна " +sum);
        if (sum%2 == 0){
            System.out.println(sum + " - это четное число" );
        }else {
            System.out.println(sum + " - это не четное число" );
        }
        if(Integer.parseInt(String.valueOf(a))%2 ==0) {
            System.out.println(a + " - это четное число");
        }else {
                System.out.println(a + " - это не четное число" );
        };
    }
}

class PilindromDemo {
    public static void main(String[] args) {
    int numer = 0;
         Numeric pil = new Numeric(numer);
         pil.pilindrom();
         pil.sumnum();

    /*      String lim = "";
          Numeric limi = new Numeric(lim);
          limi.pilindrom();
          limi.sumnum();*/
    }
}
