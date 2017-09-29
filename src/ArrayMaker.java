import java.util.ArrayList;
import java.util.List;

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
    public static List<Integer> searchMaxArray(List<Integer> defaultArray) {
        Pair firstPart = new Pair(new ArrayList(), 0);//Хранение суммы слева от отрицательного
        Pair secondPart = new Pair(new ArrayList(), 0);//Хранения суммы справа от отрицательного
        Pair minusPart = new Pair(new ArrayList(), 0);//Сумма отрицательных
        Pair maxPart = new Pair(new ArrayList(), 0);//Хранение максимальной суммы
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


            if (firstPart.size() == 0 && secondPart.size() == 0)
                return minusPart.getMaxMinusDigit();
            if(maxPart.size()==0&&secondPart.size()==0&&minusPart.size()==0)
                return firstPart.getArrayList();

            if (firstPart.getSum() + minusPart.getSum() >= 0 && secondPart.getSum() + minusPart.getSum() >= 0
                    && maxPart.getSum() < firstPart.getSum() + secondPart.getSum() + minusPart.getSum()) {

                if (maxPart.getSum() != firstPart.getSum())
                    maxPart.addAll(firstPart);


                maxPart.addAll(minusPart);
                maxPart.addAll(secondPart);
                firstPart.removeTo(maxPart);
            } else {
                maxPart.removeTo(Pair.max(firstPart, secondPart));
                firstPart.removeTo(secondPart);

            }


            secondPart.clear();
            minusPart.clear();

        }


        return maxPart.getArrayList();

    }


}



