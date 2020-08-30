import java.util.Scanner;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main{
    public static void main( String[] args ) {
        List<Long> fibonacciMain;

        System.out.println("第N番目のフィボナッチ数 及び フィボナッチ数列を表示します。");

        do{
            System.out.println("入力してください。( exit または quitで終了します。)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

        if (input.equals("exit") || input.equals("quit")) {
           System.out.println("プログラムを終了します。");
           break;
        }

        try {
           long numl = Long.parseLong(input);
           if(numl >= 1L && numl <= 70L) {
               int num = Integer.parseInt( input );
               Math math01 = new Math( num );

               fibonacciMain = math01.getFibonacci();

               System.out.println("第" + num + "番目のフィボナッチ数 " + fibonacciMain.get(num-1));
               System.out.print("第" + num + "番目のフィボナッチ数列 ");


      String separator = "";
      
      for ( long fibonacciI : fibonacciMain ) {
        System.out.print(separator + fibonacciI);
        separator = " , ";
      }


      System.out.println("");
           }
           else {
             System.out.print("数値は1以上70以下を");
           }
        }

        catch ( NumberFormatException e ) {
          System.out.println("文字列の入力は exit または quit しか受け付けません。");
          System.out.print("もう一度");
        }
    }
    while( true );
  }
}