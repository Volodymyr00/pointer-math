package math.com;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.141592;

        double r = MyMath.radius(5);
        System.out.println(r + " Довжина круга ");
        double summa = MyMath.summa(5);
        System.out.println(summa + " Площа  круга ");
        int mult = MyMath.mult(5);
        System.out.println(mult + " Квадрат числа");


    }
}
