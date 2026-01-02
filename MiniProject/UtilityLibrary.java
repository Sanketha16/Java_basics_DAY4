import java.util.*;

public class UtilityLibrary {

    // Math Utilities
    static long power(int b,int e){
        long r=1; 
        while(e-->0) r*=b; 
        return r;
    }
    static long factorial(int n){
        long f=1; 
        for(int i=1;i<=n;i++) f*=i; 
        return f;
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;
            i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    // String Utilities
    static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    static boolean isPalindrome(String s){
        return s.equalsIgnoreCase(reverse(s));
    }
    static int countVowels(String s){
        int c=0;
        for(char ch:s.toLowerCase().toCharArray())
            if("aeiou".indexOf(ch)>=0) c++;
        return c;
    }
    static String removeDuplicates(String s){
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(char c:s.toCharArray()) set.add(c);
        StringBuilder r=new StringBuilder();
        for(char c:set) r.append(c);
        return r.toString();
    }

    // Array Utilities
    static void sort(int[] a){ Arrays.sort(a); }
    static int search(int[] a,int k){
        for(int i=0;i<a.length;i++)
            if(a[i]==k) return i;
        return -1;
    }
    static int findMax(int[] a){
        int m=a[0]; for(int x:a) if(x>m) m=x; return m;
    }
    static int findMin(int[] a){
        int m=a[0]; for(int x:a) if(x<m) m=x; return m;
    }
    static void reverseArray(int[] a){
        for(int i=0,j=a.length-1;i<j;i++,j--){
            int t=a[i]; a[i]=a[j]; a[j]=t;
        }
    }

    // Testing
    public static void main(String[] args) {

        System.out.println(power(2,4));
        System.out.println(factorial(5));
        System.out.println(isPrime(17));
        System.out.println(gcd(18,24));

        System.out.println(reverse("hello"));
        System.out.println(isPalindrome("madam"));
        System.out.println(countVowels("utility"));
        System.out.println(removeDuplicates("programming"));

        int[] a={5,2,9,1};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(search(a,9));
        System.out.println(findMax(a));
        System.out.println(findMin(a));
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }
}