package Stepic;
//эта задача с сайта степик
//Вам дан список ролей и сценарий пьесы в виде массива строчек.
//Каждая строчка сценария пьесы дана в следующем виде:
//Роль: текст.
//Текст может содержать любые символы.
//Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат
// в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
//Роль:
//i) текст
//j) текст2
//...
//==перевод строки==
//
//i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует
// в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста
// не учитываются.
//
//её я ещо не решил
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
//cjplf.
        String roles2[] =new String[roles.length];
        for(int i=0;i< roles.length;i++) {
            roles2[i] =roles[i]+":";
            for(int j=0;j<roles2.length;j++) {
                System.out.println(roles2[j]);
            }
        }
        //создаю новвый 2х мерный масси, в котором буду хранить отсортированный и измененный текст по ролям.
String general[][] = new String[roles.length][];
        //создаем временную переменную для подтверждения нахождения роли roles в тексте массива textLines
        boolean yes = false;
        //создаем временную переменную для переключения во втором столбце массива general
        int k = 0;
        for(int i =0;i< roles.length;i++){
            for(int j=0;j<= textLines.length;j++){
                if(textLines[j].contains(roles[i] + ":")) {
                   general[i][k] =textLines[j];
                   k++;
                   System.out.println(general[i][k]);
               }
            }
            k=0;
        }
        for(int i =0;i< general.length;i++) {
            System.out.println(roles[i] + ":");
            for(int j=0;j<general[i].length;j++) {
                System.out.println(general[i][j]);
            }
            System.out.println();
        }
    }
}
