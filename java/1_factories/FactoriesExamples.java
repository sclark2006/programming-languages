import java.lang.reflect.Array;
import java.math.BigInteger;
import java.time.Instant;
import java.util.*;

public class FactoriesExamples {
    enum Rank { A, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,  JACK, QUEEN, KING }
    public static class SkyWalker {
        private static Map<String, SkyWalker> instances = new Hashtable<>();
        private String name;

        private SkyWalker() {}

        public static SkyWalker getInstance(String name) {
            var result = instances.get(name);
            if(result == null) {
                result = new SkyWalker();
                instances.put(name, result);
                result.name = name;
            }
            return result;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
    public static void main(String[] args) {

        //from: Type-conversion method
        //the 'var' syntax was included since Java 11
        var date = Date.from(Instant.now());
        System.out.println(String.format("Date from instant: %s\n\n", date));

        //of: Aggregation method
        Set<Rank> faceCards = EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING);
        System.out.println(String.format("Set of Cards:  %s\n\n", faceCards));

        //valueOf: Similar to of
        var prime = BigInteger.valueOf(Integer.MAX_VALUE);
        System.out.println(String.format("A Prime Integer:  %d\n\n", prime));

        //instance: returns an instance described by parameters
        SkyWalker leia = SkyWalker.getInstance("Leia");
        System.out.println(String.format("A SkyeWalker named:  %s", leia));
        SkyWalker leia1 = SkyWalker.getInstance("Leia");
        System.out.println(String.format("A SkyeWalker named:  %s", leia1));
        System.out.println(String.format("Are the same instance of Skywalkers?  %s\n\n",  leia1 == leia));


        //create or newInstance: every call returns a new instance
        var arrayInstance1 = Array.newInstance(int.class,5);
        System.out.println(String.format("Array Instance 1:  %s", arrayInstance1));
        var arrayInstance2 = Array.newInstance(int.class,5);
        System.out.println(String.format("Array Instance 2:  %s", arrayInstance2));
        System.out.println(String.format("Are the same instance of Arrays?  %s\n\n",  arrayInstance1 == arrayInstance2));

        //new type
        var namesVector = new Vector(Set.of("Anakin", "Luke", "Leia")).elements();
        List<String> allSkyWalkerNames = Collections.list(namesVector);
        System.out.println(String.format("All SkyWalkers: %s \n\n",allSkyWalkerNames));
    }
}