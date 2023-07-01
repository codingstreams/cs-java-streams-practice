package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeDataUtil {
    public static List<Integer> getRandomNumbersList(int size, int bound){
        var random = new Random();
        var numbers = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(bound));
        }

        return numbers;
    }
}
