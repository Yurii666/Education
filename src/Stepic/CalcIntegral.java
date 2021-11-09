package Stepic;
//Implement a method that numerically integrates a given function over a given interval using the left rectangle formula.
import java.util.function.DoubleUnaryOperator;

public class CalcIntegral {
    public static void main(String[] args) {
        System.out.println(integrateLeft(x -> 1, 0, 10));//10.0
        System.out.println(integrateLeft(x -> x + 2, 0, 10));//70.0
        System.out.println(integrateLeft( x -> Math.sin(x) / x , 1, 5));//0.603848
        System.out.println(integrateRight(x -> 1, 0, 10));//10.0
        System.out.println(integrateRight(x -> x + 2, 0, 10));//70.0
        System.out.println(integrateRight( x -> Math.sin(x) / x , 1, 5));//0.603848
        System.out.println(integrateMiddle(x -> 1, 0, 10));//10.0
        System.out.println(integrateMiddle(x -> x + 2, 0, 10));//70.0
        System.out.println(integrateMiddle( x -> Math.sin(x) / x , 1, 5));//0.603848


    }
    // using the left rectangle formula..
    public static double integrateLeft(DoubleUnaryOperator f, double a, double b) {
        double step = 0.000001;
        // implement dynamic selection of the grid step for a given accuracy
        // while(step*f.applyAsDouble(a)-(step/2)*f.applyAsDouble(a)>0.0000001){
        //    step=step/2;
        // }
        double i=a;
        double suma = 0;

        while (i <b) {
            suma +=step*f.applyAsDouble(i);
            i+=step;
        }
        return suma;
    }
    // using the Right rectangle formula..
    public static double integrateRight(DoubleUnaryOperator f, double a, double b) {
        double step = 0.000001;
        double i=a;
        double suma = 0;
        while (i <=b) {
            i+=step;
            suma +=step*f.applyAsDouble(i);

        }
        return suma;
    }
    //using the middle rectangle formula.
    public static double integrateMiddle(DoubleUnaryOperator f, double a, double b) {
        double step = 0.000001;
        double i=a;
        double j=a+step;
        double suma = 0;
        while (i <=b) {
            suma +=step*((f.applyAsDouble(i)+f.applyAsDouble(j))/2);
            i+=step;
            j+=step;
        }
        return suma;
    }
}
