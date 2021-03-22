/**
 * Author: Jiaying Wu
 * Created at March 22, 2020
 */
public class AlgorithmDisjoint {

    public boolean disjointOrNot(int listA[], int listB[]){
        for (int i = 0; i < listA.length; i++) {
            for (int j = 0; j < listB.length; j++) {
                if (listA[i] == listB[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AlgorithmDisjoint disointCheck = new AlgorithmDisjoint();
        
        int listA[] = {3, 2, 5};
        int listB[] = {1, 4, 6};
        boolean result1 = disointCheck.disjointOrNot(listA, listB);
        System.out.println("Disjoint( [3, 2, 5], [1, 4, 6] ) ==> " + result1);
    
        int listC[] = {3, 2, 5};
        int listD[] = {1, 2, 3};
        boolean result2 = disointCheck.disjointOrNot(listC, listD);
        System.out.println("Disjoint( [3, 2, 5], [1, 2, 3] ) ==> " + result2);

        int listE[] = {-2, -1, 0};
        int listF[] = {1, 2};
        boolean result3 = disointCheck.disjointOrNot(listE, listF);
        System.out.println("Disjoint( [-2, -1, 0], [1, 2] ) ==> " + result3);

        int listG[] = {1};
        int listH[] = {2, 6, 8, 3, 1};
        boolean result4 = disointCheck.disjointOrNot(listG, listH);
        System.out.println("Disjoint( [1], [2, 6, 8, 3, 1] )  ==> " + result4);

        int listI[] = {};
        int listJ[] = {5,4};
        boolean result5 = disointCheck.disjointOrNot(listI, listJ);
        System.out.println("Disjoint( [ ], [5, 4] ) ==> " + result5);

        int listK[] = {};
        int listL[] = {};
        boolean result6 = disointCheck.disjointOrNot(listK, listL);
        System.out.println("Disjoint( [ ], [ ] ) ==> " + result6);
    }
}