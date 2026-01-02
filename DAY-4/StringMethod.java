public class StringMethod {
    public static void main(String[] args) {
/* 
        String s = "Computer Science Engineer";
        s = s.concat(" Delta");
        System.out.println(s);
*/
/* 
        String str = "Programming";
        System.out.println(str.substring(3));      // gramming
        System.out.println(str.substring(3, 7));   // gram
*/
/*
        String str = "CSE";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
*/
/* 
        String s1 = "java";
        String s2 = new String("JAVA");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
*/
/* 
        String s1 = new String("java");
        String s2 = new String("JAVA");
        System.out.println(s1.equalsIgnoreCase(s2));
*/
/* 
        String s1 = "Java";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
*/
/* 
        String s = "Hello World";
        System.out.println(s.trim());
*/
/* 
        String s = "Automation Testing";
        s.contains("Testing");
        System.out.println(s.contains("Testing"));
*/
/* 
        String s = "Java Programming";
        System.out.println(s.startsWith("Java"));
        System.out.println(s.endsWith("ing"));
*/
        String s = "Java,Python,C++";
        String[] arr = s.split(",");
        for(String lang:arr){
            System.out.println(lang+ " ");
        }
    }

}
