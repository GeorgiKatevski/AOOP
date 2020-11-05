import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    static double findSum() {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        double money = 0.0;

        while (count != 10) {
            Random rand = new Random();
            int number = rand.nextInt(10);
            if (!list.contains(number))
            {
                list.add(number);
                count++;
            }

            money += 0.50;

        }
        System.out.println(list);

        return money;
    }

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            double number = findSum();
            System.out.println(number + " ");
            sum += number;
        }

        System.out.println("Answer:" + sum / 5.0);
    }
}
