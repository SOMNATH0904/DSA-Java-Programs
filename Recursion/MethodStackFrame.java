package Lecture32;

public class MethodStackFrame {
    static void func1(){
        int x = 1;
        func2();
        System.out.println(x);
    }

    static void func2(){
        int x = 2;
        func3();
        System.out.println(x);
    }

    static void func3(){
        int x = 3;
        System.out.println(x);
    }

    public static void main(String[] args) {
        func1();
    }
}
