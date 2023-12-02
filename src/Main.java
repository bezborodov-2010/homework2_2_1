public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 7");
        var a=5;
        var b=7;
        a=a+b-a;
        System.out.println("a = "+a);
        b=b-(a/a)-(a/a);
        System.out.println("b = "+b);
    }

}