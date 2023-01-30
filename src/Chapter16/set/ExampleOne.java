package Chapter16.set;

import java.util.Set;

public class ExampleOne {

    public static void main(String[] args) {
        Set<String> kalokalo = Set.of(
                "Bet9ja",
                "SportyBet",
                "1XBET",
                "!960BET",
                "MerryBet",
                "BetKing"
        );
        kalokalo.add("AccessBet"); //cannot be mutated
        System.out.println(kalokalo);
    }
}
