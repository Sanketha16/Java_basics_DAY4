public class MethodDemo2 {
    static int findMax(int... numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMax(10, 25, 5, 40, 15));
    }
}

    

