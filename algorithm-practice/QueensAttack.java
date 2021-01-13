public class QueensAttack {

    static boolean queenInMiddle(int r_q, int c_q, int n) {
        
        double halfPoint = Math.ceil((double) n / (double) 2);
        
        if ( r_q == halfPoint && c_q == halfPoint) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
  
      System.out.println(queenInMiddle(3, 3, 5));
    }
  }