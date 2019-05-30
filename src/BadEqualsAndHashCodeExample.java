import java.util.HashMap;
import java.util.stream.IntStream;

public class BadEqualsAndHashCodeExample {

    // TODO: provide time measurement to show how bad is performance
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        BadEqualsAndHashCodeExample example = new BadEqualsAndHashCodeExample();
        BadEqualsAndHashCodeExample example22 = new BadEqualsAndHashCodeExample();

        HashMap<BadEqualsAndHashCodeExample, Integer> map = new HashMap<>();
        IntStream
                .range(0,100)
                .forEach(index -> map.put(new BadEqualsAndHashCodeExample(), index));
    }
}
