package euler.problems.base.p002;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import euler.problems.Problem;

public class P002 implements Problem {
    public static class Pair<L, R> {
        public final L left;
        public final R right;
        
        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }
        
        public L getLeft() {
            return this.left;
        }
        
        @Override
        public String toString() {
            return "(" + left + ", " + right + ")";
        }       

        public static Pair<BigInteger, BigInteger> fib(Pair<BigInteger, BigInteger> p) {
            return new Pair<>(p.right, p.left.add(p.right));
        }
    }
    
    @Override
    public String solve(List<String> input) {        
        Pair<BigInteger, BigInteger> seed = new Pair<>(BigInteger.ZERO, BigInteger.ONE);

        Function<Integer, String> fibs = n -> Stream.iterate(seed, Pair::fib)
                .limit(n)
                .map(Pair::getLeft)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        
        return input.stream()
                .map(Integer::parseInt)
                .map(fibs::apply)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}