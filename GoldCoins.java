public class GoldCoins {

    public int findBag(int[] B) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + B[i] * (i+1);
        }
        int result = 550 - sum;
        return result;
    }
    
    public static void main(String[] args) {

        GoldCoins goldCoins = new GoldCoins();
        int[] B = {10,10,9,10,10,10,10,10,10,10};
        int result = goldCoins.findBag(B);
        System.out.println(result);
    }
}