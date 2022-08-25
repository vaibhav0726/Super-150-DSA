package Lecture_3;

public class function_demo {
    public static void main(String[] args){
        System.out.println("hello");
        addition();
        System.out.println("bye");
    }

    public  static void addition(){
        int a=5, b=7, c=a+b;
        sub();
        System.out.println(c);
    }
    public  static void sub(){
        int a=5, b=7, c=a-b;
        System.out.println(c);
    }
}