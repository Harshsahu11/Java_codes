public class Logical_Operator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        System.out.println(a>b && b>c); // Logical AND
        System.out.println(a>b || b>c); // Logical OR
        System.out.println(!(a>b));     // Logical NOT
    }
}
