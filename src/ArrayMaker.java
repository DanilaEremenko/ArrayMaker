import java.util.ArrayList;


public class ArrayMaker {
    public static int searchMaxSum(int[] defaultMass) {

        int secondSum = 0;//Хранения суммы справа от отрицательного
        int firstSum = 0;//Хранение суммы слева от отрицательного
        int maxSum = 0;//Хранение максимальной суммы
        int minusSum = 0;//Сумма отрицательных
        for (int i = 0; i < defaultMass.length; ) {


            while (defaultMass[i] >= 0 && i < defaultMass.length) {
                firstSum += defaultMass[i];
                i++;
                if (i == defaultMass.length)
                    break;
            }

            if (i != defaultMass.length)
                while (defaultMass[i] < 0 && i < defaultMass.length) {
                    minusSum += defaultMass[i];
                    i++;
                    if (i == defaultMass.length)
                        break;
                }

            if (i != defaultMass.length)
                while (defaultMass[i] >= 0) {
                    secondSum += defaultMass[i];
                    i++;
                    if (i == defaultMass.length)
                        break;
                }
            if (firstSum + minusSum < 0 && secondSum + minusSum < 0 && maxSum < Math.max(firstSum, secondSum)) {
                maxSum = Math.max(firstSum, secondSum);
                firstSum = secondSum;
            } else if (firstSum + minusSum >= 0 && secondSum + minusSum >= 0 && maxSum < firstSum + secondSum + minusSum) {
                maxSum = firstSum + secondSum + minusSum;
                firstSum = maxSum;
            } else if (maxSum < firstSum || maxSum < secondSum) {
                maxSum = Math.max(firstSum, secondSum);
                firstSum = secondSum;
            }


            secondSum = 0;
            minusSum = 0;

        }


        return maxSum;

    }

    public static ArrayList<Integer> searchMaxArray(ArrayList<Integer> defaultArray) {
        ArrayList<Integer> secondPart = new ArrayList<>();//Хранения суммы справа от отрицательного
        ArrayList<Integer> firstPart = new ArrayList<>();//Хранение суммы слева от отрицательного
        ArrayList<Integer> maxPart = new ArrayList<>();//Хранение максимальной суммы
        ArrayList<Integer> minusPart = new ArrayList<>();//Сумма отрицательных
        for (int i = 0; i < defaultArray.size(); ) {


            while (defaultArray.get(i) >= 0 && i < defaultArray.size()) {
                firstPart.add(defaultArray.get(i));
                i++;
                if (i == defaultArray.size())
                    break;
            }

            if (i == defaultArray.size())
                while (defaultArray.get(i) < 0 && i < defaultArray.size()) {
                    minusPart.add(defaultArray.get(i));
                    i++;
                    if (i == defaultArray.size())
                        break;
                }

            if (i == defaultArray.size())
                while (defaultArray.get(i) >= 0) {
                    secondPart.add(defaultArray.get(i));
                    i++;
                    if (i == defaultArray.size())
                        break;

                }
            if (ArrayElementsSum(firstPart) + ArrayElementsSum(minusPart) < 0 && ArrayElementsSum(secondPart) + ArrayElementsSum(minusPart) < 0
                    && ArrayElementsSum(maxPart) < Math.max(ArrayElementsSum(firstPart), ArrayElementsSum(secondPart))) {
                maxPart = maxArray(firstPart, secondPart);
                firstPart = secondPart;
            } else if (ArrayElementsSum(firstPart) + ArrayElementsSum(minusPart) >= 0 && ArrayElementsSum(secondPart) + ArrayElementsSum(minusPart) >= 0
                    && ArrayElementsSum(maxPart) < ArrayElementsSum(firstPart) + ArrayElementsSum(secondPart) + ArrayElementsSum(minusPart)) {

                maxPart.addAll(firstPart);
                maxPart.addAll(minusPart);
                maxPart.addAll(secondPart);
                firstPart = maxPart;
            } else if (ArrayElementsSum(maxPart) < ArrayElementsSum(firstPart) || ArrayElementsSum(maxPart) < ArrayElementsSum(secondPart)) {
                maxPart = maxArray(firstPart, secondPart);
                firstPart = secondPart;
            }


            secondPart.clear();
            minusPart.clear();

        }


        return maxPart;

    }

    static private int ArrayElementsSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer element : arrayList)
            sum += element;

        return sum;

    }

    static private ArrayList<Integer> maxArray(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        if (ArrayElementsSum(firstArray) > ArrayElementsSum(secondArray))
            return firstArray;
        else
            return secondArray;
    }


}



