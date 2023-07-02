package util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PracticeDataUtilTest {
    @Test
    void givenSizeAndBound_whenGetRandomNumbersListIsCalled_thenReturnListOfNumbers() {
        var numbers = PracticeDataUtil.getRandomNumbersList(10, 10);

        Assertions.assertEquals(10, numbers.size());
    }
}