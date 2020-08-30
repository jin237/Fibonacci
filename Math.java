import java.util.List;
import java.util.ArrayList;
//import java.util.stream.Collectors;

public class Math{
    private int N;
    private List<Long> fibonacci;

    public Math( int num ) {
        this.N = num;
        this.fibonacci = new ArrayList<Long>(N);
        if ( N > 0 ) fibonacci.add(0L);
        if ( N > 1 ) fibonacci.add(1L);
        for( int i = 2; i <= (N-1); ++i ) {
            fibonacci.add(fibonacci.get( i - 1 ) + fibonacci.get(i-2));
      }
   }

   public List<Long> getFibonacci(){
     return fibonacci;
   }
}