import java.util.List;

class App {
    public static void main(String[] args) throws Exception {
        var input = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var output = input.stream().map((x) -> Math.pow(2, x)).toList();
        System.out.println(input);
        System.out.println(output);
    }
}