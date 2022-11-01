package qaexceptionsthreads;

import java.util.Optional;

public class OptionalExample {
    public static void main( String args[]) {
        Integer val1 = null;
        Integer val2 = 4;
        Optional<Integer> int1 = Optional.ofNullable(val1);
        Optional<Integer> int2 = Optional.ofNullable(val2);


        System.out.println(int1.isPresent());
        System.out.println(int2.isPresent());

        Integer f3 = val1 != null ? val1 : 12;
        Integer f1 = int1.orElse(12);
    }
}
