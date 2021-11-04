package Stepic;
//site task stepik
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
        StringBuilder toReturn =new StringBuilder();
        for(int i =0;i< roles.length;i++){
            toReturn.append(forSearching[i]);
            toReturn.append('\n');
            for(int j=0;j< textLines.length;j++){
                if(textLines[j].startsWith(forSearching[i]+ " ")) {
                    String toReplace = (j+1)+")";
                    toReturn.append(toReplace);
                    toReturn.append(textLines[j].substring(forSearching[i].length()));
                    toReturn.append('\n');
            }
        }
            toReturn.append('\n');
   }
        System.out.println(toReturn);
}
}