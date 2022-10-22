package chapter02;

import java.util.Scanner;

public class exercise23e {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//입력
System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위:cm):");
double Radius=scanner.nextDouble();
System.out.print("원기둥의 높이를 입력하시오.(단위:cm):");
double height=scanner.nextDouble();
//처리
double area = Math.PI * Radius*Radius;
double volume = area * height;
//출력
//System.out.println("원기둥 밑변의 넓이는 " +area+"cm²이고, 원기둥의 부피는 "+volume+"cm³다");
System.out.printf("원기둥 밑변의 넓이 :%fcm²이고, 부피:%fcm³이다",area,volume);
scanner.close();

}
}
