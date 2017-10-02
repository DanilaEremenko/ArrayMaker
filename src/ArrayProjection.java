import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProjection {
    private int sum;
    private int start;
    private int end;


    public ArrayProjection(int start, int end, int sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;

    }

    public void add(int digit) {
        sum += digit;
        end++;


    }

    public void addAll(ArrayProjection arrayProjection) {
        sum += arrayProjection.getSum();
        end = arrayProjection.getEnd();
    }

    public void removeTo(ArrayProjection arrayProjection) {
        start = arrayProjection.getStart();
        end = arrayProjection.getEnd();
        sum = arrayProjection.getSum();
    }

    public int size() {
        return end - start;
    }


    public void setBounds(int start, int end) {
        this.start = start;
        this.end = end;
    }


    public List<Integer> getMaxMinusDigit(List<Integer> defaultArray) {
        int currentELement;
        int maxElemnt = defaultArray.get(0);
        for (int i = start; i < end; i++) {
            currentELement = defaultArray.get(i);
            if (currentELement > maxElemnt)
                maxElemnt = currentELement;
        }

        return Arrays.asList(maxElemnt);

    }

    public List<Integer> getArray(List<Integer> defaultArray) {
        List list = new ArrayList<Integer>();
        for (int i = start; i < end; i++)
            list.add(defaultArray.get(i));
        return list;

    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    public int getSum() {
        return sum;
    }


    public void clear() {
        start = 0;
        end = 0;
        sum = 0;
    }

    static ArrayProjection max(ArrayProjection arrayProjection, ArrayProjection arrayProjection2) {
        if (arrayProjection.getSum() > arrayProjection2.getSum())
            return arrayProjection;
        else
            return arrayProjection2;

    }
}
