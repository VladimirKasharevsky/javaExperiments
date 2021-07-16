import java.util.Random;
import java.util.stream.IntStream;


public class MainStreamApi {

    public static void main(String[] args) {

        IntStream.of(10, 20, 30)
                .filter(x -> x <= 20)
                .map(x -> x - 1)
                .forEach(System.out::println);
    }

}
