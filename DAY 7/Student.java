public class Student {
    String name;
    int age;
    Student(String n, int a){
        name = n;
        age = a;
    }
    public static void main(String[] args) {
        Student obj = new Student("Sanketha", 20);
        System.out.println(obj.name+" "+obj.age);
    }
    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
    
}
