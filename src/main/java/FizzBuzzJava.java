public class FizzBuzzJava {

    public static void main(String[] args) {
        fizzBuzz(185);
    }

    private static void fizzBuzz(int number) {
        StringBuilder stringBuilder;
        for (int i = 1; i<= number; ++i) {
            stringBuilder = new StringBuilder()
                    .append(i)
                    .append(" ");
            if(i%3 == 0) {
                stringBuilder.append("fizz");
            }
            if(i%5 == 0) {
                stringBuilder.append("buzz");
            }
            System.out.println(stringBuilder);
        }
    }
}
