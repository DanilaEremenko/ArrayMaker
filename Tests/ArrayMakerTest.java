import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayMakerTest {
    @Test
    public void searchMaxArray() throws Exception {

        //Тест №1:
        List<Integer> inputListTest1 = Arrays.asList(5, -3, 6, -7, 6);
        List<Integer> outputListTest1 = Arrays.asList(5, -3, 6);

        //Тест №2:
        List<Integer> inputListTest2 = Arrays.asList(15, -30, 20, -10, 100);
        List<Integer> outputListTest2 = Arrays.asList(20, -10, 100);

        //Тест №3:
        List<Integer> inputListTest3 = Arrays.asList(1, 2, -3, -7, 8, 6, -20, 7, 0, 8, 1, -3, 11, -2, 0, 5, 48);
        List<Integer> outputListTest3 = Arrays.asList(7, 0, 8, 1, -3, 11, -2, 0, 5, 48);

        //Тест №4:
        List<Integer> inputListTest4 = Arrays.asList(-5, -5, 10, 10, -5, 4, 10);
        List<Integer> outputListTest4 = Arrays.asList(10, 10, -5, 4, 10);


        //Тест №5:
        List<Integer> inputListTest5 = Arrays.asList(1, 2, 3, 6, -100, 10);
        List<Integer> outputListTest5 = Arrays.asList(1, 2, 3, 6);


        //Тест №6:
        List<Integer> inputListTest6 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40, 0, 0);
        List<Integer> outputListTest6 = Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40, 0, 0);


        //Тест №7:
        List<Integer> inputListTest7 = Arrays.asList(10, -100, 50, 50, 50, 50, -100, 10);
        List<Integer> outputListTest7 = Arrays.asList(50, 50, 50, 50);


        //Тест №8:
        List<Integer> inputListTest8 = Arrays.asList(5, 5, 5, 5);
        List<Integer> outputListTest8 = Arrays.asList(5, 5, 5, 5);

        //Тест №9
        List<Integer> inputListTest9 = Arrays.asList(0, 0, 0, 0);
        List<Integer> outputListTest9 = Arrays.asList(0, 0, 0, 0);

        //Тест №10
        List<Integer> inputListTest10 = Arrays.asList(-3, -4, -5);
        List<Integer> outputListTest10 = Arrays.asList(-3);

        //Тест №11
        List<Integer> inputListTest11 = Arrays.asList(-5, 0, 0);
        List<Integer> outputListTest11 = Arrays.asList(0, 0);


        assertEquals(outputListTest1, ArrayMaker.searchMaxArray(inputListTest1));
        assertEquals(outputListTest2, ArrayMaker.searchMaxArray(inputListTest2));
        assertEquals(outputListTest3, ArrayMaker.searchMaxArray(inputListTest3));
        assertEquals(outputListTest4, ArrayMaker.searchMaxArray(inputListTest4));
        assertEquals(outputListTest5, ArrayMaker.searchMaxArray(inputListTest5));
        assertEquals(outputListTest6, ArrayMaker.searchMaxArray(inputListTest6));
        assertEquals(outputListTest7, ArrayMaker.searchMaxArray(inputListTest7));
        assertEquals(outputListTest8, ArrayMaker.searchMaxArray(inputListTest8));
        assertEquals(outputListTest9, ArrayMaker.searchMaxArray(inputListTest9));
        assertEquals(outputListTest10, ArrayMaker.searchMaxArray(inputListTest10));
        assertEquals(outputListTest11, ArrayMaker.searchMaxArray(inputListTest11));

    }

}