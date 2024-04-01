package lang.object.tostring;

public class BadObjectPrinter {
    public static void print(Car car) { //Car 전용 메서드
        String string = "객체 정보 출력: " + car.carInfo(); //carInfo() 메서드 만듬
        System.out.println(string);
    }
    public static void print(Dog dog) { //Dog 전용 메서드
        String string = "객체 정보 출력: " + dog.dogInfo(); //dogInfo() 메서드 만듬
        System.out.println(string);
    }
}
