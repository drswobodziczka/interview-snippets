import java.util.HashMap;

public class BadEqualsAndHashCodeExample {

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

        HashMap<String, BadEqualsAndHashCodeExample> map = new HashMap<>();
        map.put("1", example);
        map.put("2", example22);
    }
}
