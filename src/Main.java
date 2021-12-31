import java.util.ArrayList;
import java.util.List;

public class Main {

    //기본적인 문법
    //항상 세미콜론 ; 으로 마침표 찍는다
    //주석 작성하는법 //이후에 작성되는 문장은 코드로써 인식되지않는다 지금 내가 쓰고있는것도 주석~ (코드를 부연설명할때 씀)
    /*
    이런식으로
    여러 라인을
    한꺼번에
    주석처리
    하는 방법도
    있다.
     */


    //컴퓨터 = 일하는 사람 + 책상 + 책장

    //책상에 내가 필요한것들은 펼쳐놓는다
    //기본자료형
    //정수
    static int number = 0;
    //소수
    static double decimal = 0.1;
    //문자
    static char singleword = 'a';

    //객체형
    //문자열 (이친구는 기본자료형은 아니고 객체(나중에 설명하게될 날이오겠져..)이지만 원체 많이쓰기에
    static String sentence = "youchul";

    public static void main(String arg[]) {
        //사람한테 일을 시켜볼려면

        //콘솔에 출력하는 method System.out.println();
        System.out.println(number);
        //number에 1을 더해서 number라는공간에 그값을 지정 (절대로 같다는 의미가 아님)
        number = number + 1;

        System.out.println(number);




    }
}
