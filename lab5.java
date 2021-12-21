import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Чтобы закончить ввод чисел, напишите слово \"quit\"");
        ArrayList<Float> numbers = new ArrayList<>();
        LinkedList<Float> result = new LinkedList<>();
        int k = 0;
        do {
            System.out.print("Введите " + (k + 1) + " число: ");
            if (scan.hasNextFloat()) {
                numbers.add(scan.nextFloat());
                k++;
            } else if(scan.next().equals("quit")){
                break;
            } else {
                System.out.println("Ошибка ввода. Программа закончила своё выполнение.");
                return;
            }
        } while (true);
        result.add(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++){
            float num = numbers.get(i);
            if(result.get(result.size() - 1) < num) {
                result.add(num);
            }
        }
        System.out.println("Исходный массив: " + numbers);
        System.out.println("Изменённый массив: " + result);
        scan.close();
    }
}