import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int amount = 4;
        IntStream.range(0, amount).mapToObj(i -> scanner.nextInt() - 1 + " ").forEachOrdered(System.out::print);
    }
}