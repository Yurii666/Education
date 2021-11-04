package Stepic;

public class PrintTextPerRole2 {
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
        //array for variables to search by role
    String[] forSearching=new String[roles.length];
   for(int i =0;i< roles.length;i++){
        forSearching[i] = roles[i]+":";
    }
   //create a variable to return
        StringBuilder a =new StringBuilder();
        for(int i =0;i< roles.length;i++){
            a.append(forSearching[i]);
            a.append('\n');
            for(int j=0;j< textLines.length;j++){
                if(textLines[j].startsWith(forSearching[i]+ " ")) {
                    String toReplace = (j+1)+")";
                    a.append(toReplace);
                    a.append(textLines[j].substring(forSearching[i].length()));
                    a.append('\n');
            }
        }
        a.append('\n');
   }
        System.out.println(a);
}
}