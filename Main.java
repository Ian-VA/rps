import java.util.*;
import static java.util.Map.entry;    

public class Main {
    public static void main(String[] args) {
      NewClass1 instance1 = new NewClass1();
      NewClass2 instance2 = new NewClass2();
      
      Map<String, Integer> convert_to_number = Map.ofEntries(
        entry("rock", 0),
        entry("paper", 1),
        entry("scissors", 2)
      );
      
      boolean won = false;
      int[] wins = new int[2];
      int roundnum = 1;

      while (!won){
        var decision1 = instance1.getRockPaperScissors();
        var decision2 = instance2.getRockPaperScissors();
        
        System.out.println("Player 1 picks: " + decision1);
        System.out.println("Player 2 picks: " + decision2);
        
        int winner = ((3 + convert_to_number.get(instance1.getRockPaperScissors().toLowerCase()) - convert_to_number.get(instance2.getRockPaperScissors().toLowerCase())) % 3);
        
        if (winner > 0) {
          wins[winner]++;
          System.out.println("Player " + winner + " wins round " + roundnum);
    
          won = wins[winner] >= 4 ? true : false;
          
          if (won) {System.out.println(String.format("PLAYER %s WINS!!!!", winner)); System.out.println(String.format("%d-%d", wins[1], wins[0]));}
          
          
        } else {
          System.out.println("Draw on round " + roundnum);
        }
        
        roundnum++;
      }
      

  }
}
