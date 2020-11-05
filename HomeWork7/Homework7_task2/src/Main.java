import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aBc");
        list.add("d");
        list.add("ef");
        list.add("123456");
        System.out.println(list);

       list.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
        //System.out.println(list);



    }
}
