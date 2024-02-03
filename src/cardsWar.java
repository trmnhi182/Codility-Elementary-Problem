/**Alec and Bob are playing a game called Cards War. Both players have one deck containing N
 * cards each. The hierarchy of card values is as follows: ace (marked with the symbol A),
 * king (K), queen (Q), jack (J), ten (T) and from nine to two (9−2).
 *
 * The game is played in turns. In every turn, each player draws one card from the top of their deck.
 * The player who draws the higher card wins the current turn. If both players draw the same card,
 * nobody wins and they proceed to the next turn. After each turn, the drawn cards are put aside and
 * not used again in the current game.
 *
 * Let's consider a single game, where:
 *      Alec's deck consists of (from top to bottom): ace, five, eight, six, queen, king;
 *      Bob's deck consists of (from top to bottom): jack, jack, six, five, three, king.
 *
 * Alec wins the first, third, fourth and fifth turns. Bob wins the second turn. Note that nobody wins
 * the last turn since both players draw the same card (king). You have seen both players' decks prepared
 * for the next duel. How many turns will Alec win in the game?
 *
 * Write a function that, given two non-empty strings A, B consisting of N card symbols (representing
 * Alec's and Bob's decks, respectively), returns the number of turns that Alec will win.
 *
 * For example, given "A586QK" and "JJ653K", your function should return 4, as explained above.
 * Given "23A84Q" and "K2Q25J", your function should also return 4, since Alec wins the second, third,
 * fourth and sixth turns.
 *
 * Assume that:
 * N is an integer within the range [1..1,000];
 * strings A and B consist only of the following characters: 2-9, T, J, Q, K and/or A; strings A and
 * B are of equal length.
 * */

public class cardsWar {
    public static void main(String[] args){
        System.out.println(solution("A586QK","JJ653K"));
        System.out.println(solution("23A84Q","K2Q25J"));
        System.out.println(solution("222222","K2Q1QJ"));
    }

    public static int solution(String firstPlayerCards, String secondPlayerCards){
        int count =0;
        int[] valuesA = new int[firstPlayerCards.length()];
        int[] valuesB = new int[firstPlayerCards.length()];

        for(int i=0; i<firstPlayerCards.length(); i++){
            char card = firstPlayerCards.charAt(i);
            valuesA[i] = getCardValue(card);
            card = secondPlayerCards.charAt(i);
            valuesB[i] = getCardValue(card);
        }

        for(int j=0; j<firstPlayerCards.length(); j++){
            if(valuesA[j]>valuesB[j]) count ++;;
        }
        return count;
    }

    private static int getCardValue(char card){
        switch (card) {
            case 'A':
                return 14;
            case 'K':
                return 13;
            case 'Q':
                return 12;
            case 'J':
                return 11;
            default:
                return Character.getNumericValue(card);
        }
    }
}
