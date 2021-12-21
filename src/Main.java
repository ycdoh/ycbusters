import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String arg[]) {


        System.out.println("hello world");


        String string = "abcd";


        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");



        stringList.stream().forEach(sentence -> {
            System.out.println(sentence);
        });


    }
}
