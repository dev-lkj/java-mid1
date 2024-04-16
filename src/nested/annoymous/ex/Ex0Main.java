package nested.annoymous.ex;

public class Ex0Main {
    //이 코드의 중복이 보일 것이다. 코드를 리팩토링해서 코드의 중복을 제거해보자.

    public static void helloJava() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 종료");
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
