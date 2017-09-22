import java.util.ArrayList;
import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

        //Тест №1:
        ArrayList<Integer> inputListTest1 = new ArrayList<>(Arrays.asList(5, -3, 6, -7, 6));
        ArrayList<Integer> outputListTest1 = new ArrayList<>(Arrays.asList(5, -3, 6));

        //Тест №2:
        ArrayList<Integer> inputListTest2 = new ArrayList<>(Arrays.asList(15, -30, 20, -10, 100));
        ArrayList<Integer> outputListTest2 = new ArrayList<>(Arrays.asList(20, -10, 100));

        //Тест №3:
        ArrayList<Integer> inputListTest3 = new ArrayList<>(Arrays.asList(5, 5, 5, 5));
        ArrayList<Integer> outputListTest3 = new ArrayList<>(Arrays.asList(5, 5, 5, 5));

        //Тест №4:
        ArrayList<Integer> inputListTest4 = new ArrayList<>(Arrays.asList(-5, -5, 10, 10, -5, 4, 10));
        ArrayList<Integer> outputListTest4 = new ArrayList<>(Arrays.asList(10,10,-5, 4, 10));


        //Тест №5:
        ArrayList<Integer> inputListTest5 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, -100, 10));
        ArrayList<Integer> outputListTest5 = new ArrayList<>(Arrays.asList(1, 2, 3, 6));


        //Тест №6:
        ArrayList<Integer> inputListTest6 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40, 0, 0));
        ArrayList<Integer> outputListTest6 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, -1, -1, -1, 100, -40, -1, -3, -5, 10, 40, 0, 0));


        //Тест №7:
        ArrayList<Integer> inputListTest7 = new ArrayList<>(Arrays.asList(10, -100, 50, 50, 50, 50, -100, 10));
        ArrayList<Integer> outputListTest7 = new ArrayList<>(Arrays.asList(50, 50, 50, 50));


        //Тест №8:
        ArrayList<Integer> inputListTest8 = new ArrayList<>(Arrays.asList(1, 2, -3, -7, 8, 6, -20, 7, 0, 8, 1, -3, 11, -2, 0, 5, 48));
        ArrayList<Integer> outputListTest8 = new ArrayList<>(Arrays.asList( 7, 0, 8, 1, -3, 11, -2, 0, 5, 48));


        System.out.println(ArrayMaker.searchMaxArray(inputListTest1).equals(outputListTest1));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest2).equals(outputListTest2));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest3).equals(outputListTest3));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest4).equals(outputListTest4));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest5).equals(outputListTest5));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest6).equals(outputListTest6));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest7).equals(outputListTest7));
        System.out.println(ArrayMaker.searchMaxArray(inputListTest8).equals(outputListTest8));




    }

}
