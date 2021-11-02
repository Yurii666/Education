package java_10thEdition;
//вичислить расстояние, проходимое светом, используя переменную long
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //приблизительная скорость света, миль в час
        lightspeed = 186000;
        days = 1000;//указываем ко-во дней

        seconds =days *24*60*60;
        distance = lightspeed*seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");

    }
}
