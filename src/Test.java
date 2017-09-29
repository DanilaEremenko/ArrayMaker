import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args) {
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
        List<Integer> inputListTest8 = Arrays.asList(5,5,5,5);
        List<Integer> outputListTest8 = Arrays.asList(5,5,5,5);

        //Тест №9
        List<Integer> inputListTest9 = Arrays.asList(0,0,0,0);
        List<Integer> outputListTest9 = Arrays.asList(0,0,0,0);

        //Тест №10
        List<Integer> inputListTest10 = Arrays.asList(-3,-4,-5);
        List<Integer> outputListTest10 = Arrays.asList(-3);

        //Тест №11
        List<Integer> inputListTest11 = Arrays.asList(-5,0,0);
        List<Integer> outputListTest11 = Arrays.asList(0,0);


        System.out.println(ArrayMaker.searchMaxArray(inputListTest1).equals(outputListTest1));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest2).equals(outputListTest2));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest3).equals(outputListTest3));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest4).equals(outputListTest4));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest5).equals(outputListTest5));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest6).equals(outputListTest6));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest7).equals(outputListTest7));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest8).equals(outputListTest8));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest9).equals(outputListTest9));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest10).equals(outputListTest10));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest11).equals(outputListTest11));


    }

}