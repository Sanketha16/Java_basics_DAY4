public class StringMethod {
    public static void main(String[] args) {

        String s = "Computer Science Engineer";
        s = s.concat(" Delta");
        System.out.println(s);
/* 
        String str = "Programming";
        System.out.println(str.substring(3));      // gramming
        System.out.println(str.substring(3, 7));   // gram
*/

        String str = "CSE";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
    }
}
