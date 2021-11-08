package Stepic;
//this task from the stepic site
//Write a method that will group the lines by role, number them and return the result in the form of ready-made text
class ForSearching{
    String x1[];
    String x2[];
    StringBuilder toReturn;

    ForSearching(String y1[],String y2[]){
        x1=y1;
        x2=y2;
    }
    StringBuilder toreturn() {
        toReturn = new StringBuilder();
        String[] forSearching=new String[x1.length];
        for (int i = 0; i < x1.length; i++) {
            forSearching[i] = x1[i] + ":";
            toReturn.append(forSearching[i]);
            toReturn.append('\n');
            for (int j = 0; j < x2.length; j++) {
                if (x2[j].startsWith(forSearching[i] + " ")) {
                    String toReplace = (j + 1) + ")";
                    toReturn.append(toReplace);
                    toReturn.append(x2[j].substring(forSearching[i].length()));
                    toReturn.append('\n');
                }
            }
            toReturn.append('\n');
        }
        return toReturn;
    }
}

class PrintTextPerRole2 {
    public static void main(String[] args) {

    String roles[] ={"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич"};
    String [] textLines={
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
       ForSearching text = new ForSearching(roles, textLines);
       System.out.println(text.toreturn());
    }
}