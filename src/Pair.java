import java.util.ArrayList;
import java.util.Arrays;

public class Pair {
    private ArrayList<Integer>arrayList;
    private int sum;


    public Pair(ArrayList arrayList,int sum){
        this.arrayList=arrayList;
        this.sum=sum;

    }

    public void add(Integer digit){
        this.arrayList.add(digit);
        sum+=digit;
    }

    public void addAll(Pair pair){
       arrayList.addAll(pair.getArrayList());
       sum+=pair.getSum();

    }

    public void removeTo(Pair pair){
        arrayList.clear();
        arrayList.addAll(pair.getArrayList());
        sum=pair.getSum();

    }

    public void clear(){
        arrayList.clear();
        sum=0;

    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public int getSum() {
        return sum;
    }

    public int size(){
        return arrayList.size();
    }

    public ArrayList getMaxMinusDigit(){
        int currentELement;
        int maxElemnt=arrayList.get(0);
        for (int i=1;i<arrayList.size();i++) {
            currentELement=arrayList.get(i);
            if(currentELement>maxElemnt)
                maxElemnt=currentELement;
        }

        arrayList.clear();
        arrayList.add(maxElemnt);
        return arrayList;

    }

    static Pair max(Pair pair, Pair pair2){
     if(pair.getSum()>pair2.getSum())
         return pair;
     else
        return pair2;

    }
}
