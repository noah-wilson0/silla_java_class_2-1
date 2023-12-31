package a0926;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectRead01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner stdin=new Scanner(System.in);
        System.out.println("입력 파일명을 입력하세요 : ");
        String fileName=stdin.next();

        //객체를 기록할 수 있는 ObjectInputStream 객체 생성.
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName));

        //직렬화된 객체 읽어오기
        Object s2=ois.readObject();

        //readObject()메소드로 직렬화된 객체의 2진 데이터를 읽어서 객체 타입으로 캐스팅(형 변환)한다.
        PersonInfo p1=(PersonInfo)ois.readObject();
        PersonInfo p2=(PersonInfo)ois.readObject();

        System.out.println(s2); //1
        System.out.println("이름 : "+p1.name); //2
        System.out.println("주소 : "+p1.city); //2
        System.out.println("나이 : "+p1.age); //2

        System.out.println("이름 : "+p2.name); //33
        System.out.println("주소 : "+p2.city); //3
        System.out.println("나이 : "+p2.age); //3

        


    }
}
