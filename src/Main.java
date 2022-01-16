import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String arg[]) {
        //문자
        //0 or 1 참거짓
        //숫자 0123445667 7.2 7.34 1.21312 -1

        //character 약자
        //(data모양) 이름 = (생긴모양세);
        //이거는 이러이러한 의도를 갖고 한거고 요거는 요거다
        char word = 'a';
        char firstName = 'l';
        char middleName = 's';
        char lastName = 'i';

        boolean logic = false;
        //참거짓이 어디에 쓰이냐면
        //2는 4보다 작다는 true 이 true를 trueOrFalse라는 이름을 갖는 boolean에다가 지정
        boolean trueOrFalse = 2 < 4; // boolean trueOrFalse = true;

        // = 의 의미 (우선 수학적인것처럼 절대 '같다'는 아님
        //programming에서 =은 거의 대부분 (우선java에서는 100%) 넣는다라는 의미가 더 맞음;
        int number = 100;
        //이게 무슨의미냐면 number라는 공간에 100을 넣는다

        //정수만
        int numberA = 2;
        if (numberA < 4) {
            System.out.println("이새임");
        }


        //소수만
        double numberB = 2;

        //문자열
        String name = "이새임";
        String single = "이";

        //빨간줄로 틀린거 알려줄때 alt + enter 누르면 수정방법을 추천해준다. (다만 영어로)
        String sdf = "a";


        //여기서 출력하겠다
        System.out.println(word);
        System.out.println(logic);
        System.out.println(numberA);
        System.out.println(numberB);
        System.out.println(name);


        //numberA = 2
        //numberB = 2.000000


        //비교연산
//        int result = 2*(4+67);

        boolean r = 2 >= 4;


        // >
        // <
        // <=
        // >=
        // ==
        // !=

        boolean r2 = 2!=2;
        boolean r3 = 2!=3;

        System.out.println(r2);
        System.out.println(r3);



        int a = 100;
        int b = 200;
        int x = 400;
        //조건문
        if (x != (a + b)) {
            System.out.println("결과값 참");
        } else {
            System.out.println("거짓");
        }


        if (x == 100) {
            System.out.println("1");
        } else if (x == 200) {
            System.out.println("2");
        } else if (x == 300) {
            System.out.println("3");
        }


        int c = 10;

        //c가 50보다 클경우 "50"를 출력하고
        //c가 150보다 클경우 "150을 출력하고
        //그외에는 "결과없음"을 출력하는 조건문을 작성하세요

        if (c>50) {
            System.out.println("50");
        } else if (c>150) {
            System.out.println("150");
        } else {
            System.out.println("결과없음");
        }

        //반복문
        //for 반복
        // i = i + 1
        //for (시작할인덱스; 인덱스조건 (반복할 조건); 1cycle이후에 할 작업)
        for (int i=0; i < 100; i= i+1) {
            //do something
//            System.out.println("I did something");
//            System.out.println(i);
        }

        //while반복
        // while (반복조건)
        int i=0;
        while (i < 100) {
//            System.out.println("I did something");
//            System.out.println(i);
            i = i+1;
        }

        //for문으로 짜세요
        //0부터 99까지반복하는데
        //출력은 짝수만해보기 (hint 짝수는 %2 연산하면 나머지가 0이다)
        for (int j=0; j < 100; j=j+1) {
            if (j%2==0) {
                System.out.println(j);
            }
        }

        //while로 짜보세요
        //result에 1부터 100까지의 모든 정수의 합을 구해서 넣어보십쇼

        int result = 0;
        int z = 1;
        while (z < 101) {
            result = result + z;
            z = z+1;
        }




    }
}
