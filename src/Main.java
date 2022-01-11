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




    }
}
