import java.util.ArrayList;

/*Для нахождения наибольльшего подмассива проходим 1 раз циклом for по исходному массиву.
* Используем 3 дополнительных массива:
* firstPart-хранит положительную часть до отрицательной части
* secondPart-хранит положительную часть после отрицательной части
* minusPart-хранит отрицательную часть
* Таким образом, после нахождения подмассивов firstPart, secondPart и minusPart сравниваем их
* ЕСЛИ firstPart и secondPart не меньше отрицательной части,а сумма firstPart, secondPart и minusPart
* больше текщуего значения maxPart сливаем массивы firstPart,secondPart и minusPart
* и присваиваем значение полученного массива массиву maxPart
* firstPart присваеиваем значение maxPart, т.к. следующий secondPart надо будет сравнивать с ним
* ИНАЧЕ берем больший из firstPart и secondPart и присваиваем полученное значение массиву maxPart
*firstPart присваиваем значение текущего secondPart, т.к.следующий secondPart надо будет сравнивать с ним */

public class ArrayMaker {


    //Находит наибольший подмассива
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

            if (i != defaultArray.size())
                while (defaultArray.get(i) < 0 && i < defaultArray.size()) {
                    minusPart.add(defaultArray.get(i));
                    i++;
                    if (i == defaultArray.size())
                        break;
                }

            if (i != defaultArray.size())
                while (defaultArray.get(i) >= 0) {
                    secondPart.add(defaultArray.get(i));
                    i++;
                    if (i == defaultArray.size())
                        break;

                }

             if (arrayElementsSum(firstPart) + arrayElementsSum(minusPart) >= 0 && arrayElementsSum(secondPart) + arrayElementsSum(minusPart) >= 0
                    && arrayElementsSum(maxPart) < arrayElementsSum(firstPart) + arrayElementsSum(secondPart) + arrayElementsSum(minusPart)) {

                if (!maxPart.equals(firstPart))
                    maxPart.addAll(firstPart);
                maxPart.addAll(minusPart);
                maxPart.addAll(secondPart);
                removeTo(firstPart, maxPart);
            } else {
                removeTo(maxPart, maxArray(firstPart, secondPart));
                removeTo(firstPart, secondPart);
            }


            secondPart.clear();
            minusPart.clear();

        }


        return maxPart;

    }

    //Возвращает сумму элементов массива
    static private int arrayElementsSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer element : arrayList)
            sum += element;

        return sum;

    }


    //Возвращает больший массив
    static private ArrayList<Integer> maxArray(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        if (arrayElementsSum(firstArray) > arrayElementsSum(secondArray))
            return firstArray;
        else
            return secondArray;
    }

    //Переносит содержимое одного массива в другой
    static private void removeTo(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        arrayList.clear();
        arrayList.addAll(arrayList2);

    }

}



