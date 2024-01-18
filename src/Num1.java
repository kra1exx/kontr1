import java.util.*;
public class Num1 {
    public static void main(String[] args) {
        System.out.println("Введите 4 числа (x1, y1, x2, y2):");
        Scanner sc = new Scanner(System.in);
        Float x1 = sc.nextFloat(), y1 = sc.nextFloat(), x2 = sc.nextFloat(), y2 = sc.nextFloat();
        System.out.println(String.format("Расстояние %f", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))));
    }
}