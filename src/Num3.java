import java.util.*;
public class Num3 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел, оканчивающихся 0:");
        Scanner sc = new Scanner(System.in);
        int curr = 0;
        int summ = 0;
        while ((curr = sc.nextInt()) != 0) {
            summ += curr;
        }
        System.out.println(String.format("Сумма чисел %d", summ));
    }
}