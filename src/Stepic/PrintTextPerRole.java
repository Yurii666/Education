package Stepic;
//this task from the stepic site
//since it works for me but not on the site, I will make 2 option
public class PrintTextPerRole {
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
        String[] forSearching=new String[roles.length];
        for(int i =0;i< roles.length;i++){
            forSearching[i] = roles[i]+":";
        }
        for(int i =0;i< roles.length;i++){
            System.out.println(forSearching[i]);
            for(int j=0;j< textLines.length;j++){
                if(textLines[j].contains(roles[i] + ":")) {
                    String toReplace = (j+1)+")";
                    System.out.println(textLines[j].replaceAll(forSearching[i],toReplace));
               }
            }
            System.out.println();
         }
    }
}
