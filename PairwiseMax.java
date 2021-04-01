import java.util.ArrayList;
import java.util.List;

public class PairwiseMax {

    public static List<Integer> findMax(int listA[], int listB[]) {

        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < listA.length; i ++) {
            if (listA[i] > listB[i]) {
                finalList.add(listA[i]);
            }
            else {
                finalList.add(listB[i]);
            }
        }
        return finalList;
    }

    public static void main(String[] args) {

        PairwiseMax findMax = new PairwiseMax();
        int listA[] = {55, -55};
        int listB[] = {236, -236};
        List<Integer> result = PairwiseMax.findMax(listA, listB);
        System.out.println(result);
    }
}
