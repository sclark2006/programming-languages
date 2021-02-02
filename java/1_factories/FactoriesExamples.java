import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

public class FactoriesExamples {
    enum Rank { A, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,  JACK, QUEEN, KING }
    public static void main(String[] args) {

        //from: Type-conversion method
        Date date = Date.from(Instant.now());
        System.out.println(String.format("Date from instant: %s", date));

        //of: Aggregation method
        Set<Rank> faceCards = EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING);
        System.out.println(String.format("Set of Cards:  %s", faceCards));

        //valueOf: Similar to of
        var prime = BigInteger.valueOf(Integer.MAX_VALUE);
        System.out.println(String.format("A Prime Integer:  %d", prime));

    }
}