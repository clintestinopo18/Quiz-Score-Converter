import java.util.*;

public class quizaverager {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

    println("Transmute, Compute % Quiz Average");

    // get array length
     int n = getN("How many quizzes(2..5)? ", 2, 5, sc);
    
      println("\nEnter Quiz RawScore and PerfectScore: ");
      print("Example: 15 20 (no comma)");

      //initialize arrays 
      int[] raw = new int[n]; // raw scores
      int[] perfect = new int[n]; // perfect scores

      // get rawScore, perfectScore pairs
      getPair(raw, perfect, sc);
      
      println("Transmutation: Base 0");

      // sum up transmuted scores
      int tsum = transmSum(raw, perfect, n);

      // display ave
      double ave =  average(tsum, n);//(float) tsum/n;
      println("Quiz Average: " + ave + "%");
      
    }
    //----------------------------------------------------
    static void print(Object o){ System.out.print(o); }
    static void println(Object o){ System.out.println(o); };
    static void println(){ System.out.println(); };

    static int getN(String prompt, int LB, int UP, Scanner sc){
      int n;
       do {
          print(prompt);
          n = sc.nextInt();
     } while(!(n>=2 && n<=5));
     return n;
    }

   static void getPair(int[]raw, int[] perfect, Scanner sc){
    for(int j = 0; j<raw.length; j++){
      print("Quiz " + (j+1) + ": ");
      raw[j] = sc.nextInt();
      perfect[j] = sc.nextInt();
      }
   }

   static int transmSum(int[] raw, int[] perfect, int n){
      int[] transm = new int [n];  //transmutated % score
      int sum = 0;
      for(int j=0; j<transm.length; j++){
        //Quiz1: 20/20 = 100%
        transm[j] =  100*raw[j]/perfect[j];
        sum += transm[j]; //accumulate
        println("Quiz" + (j+1) + ": " + raw[j] + " / " + perfect[j] +  " = " +  transm[j] + " % ");
      };
      return sum;
   }
   static double average(int sum, int n){
   return (float)sum/n;
    
   }
}
