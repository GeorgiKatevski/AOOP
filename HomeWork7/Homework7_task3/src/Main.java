import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> streamNumbers=(IntStream.rangeClosed(1,100).mapToObj(Integer::toString));
        String string=streamNumbers.reduce((numberOne,numberTwo)->(numberOne + "#" + numberTwo)).orElse("");

        System.out.println(string);

        List<Integer> list=new ArrayList<Integer>();
        Random rand=new Random();
        for(int i=0;i<20;i++)
        {
            int random=rand.nextInt(31);
            list.add(random);
        }


        Stream<Integer> numbersStream=list.stream();

        System.out.println(numbersStream.collect(Collectors.toList()));
        Stream<Integer> numbersStream2=list.stream();

        boolean dividedByFive=  numbersStream2.anyMatch(i -> i % 5==0);
        System.out.println("Has number divided by five? "+dividedByFive);

        Stream<Integer> numbersStream3=list.stream();
      boolean smaller= numbersStream3.allMatch(i-> i<15);
        System.out.println("All numbers smaller than 15?: "+smaller);

        Stream<Integer> numbersStream4=list.stream();
       double average= numbersStream4.mapToInt(i->i).average().orElse(0);
        System.out.println("Average: "+average);

        Stream<Integer> numbersStream5=list.stream();
        boolean biggerFromAvg=numbersStream5.filter(i-> i>average).count()>5;
        System.out.println(biggerFromAvg);

    }
}
