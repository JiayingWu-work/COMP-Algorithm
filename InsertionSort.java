public class InsertionSort {
    
    public int[] inertionSort (int s[]) {
        
        for (int i = 0; i < s.length; i++) {
            int j = i;
            while(j > 0 && s[j] < s[j-1]) {
                int temp = s[j];
                s[j] = s[j-1];
                s[j-1] = temp;
                j = j - 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        
        InsertionSort inertionSort = new InsertionSort();
        int[] s = {50, 30, 20, 10, 40, 60};
        int[] result = inertionSort.inertionSort(s);
        for (int each : result){
            System.out.println(each);
        }
    }
}
