public class UtilityMethods {
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3));
        System.out.println("Is Even: " + isEven(10));
        System.out.println("Max: " + max(7, 4));
        System.out.println("Reversed String: " + reverseString("Java"));
        System.out.println("Factorial: " + factorial(5));
    }
}

    

