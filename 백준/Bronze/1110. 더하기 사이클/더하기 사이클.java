import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception  {
		Scanner in = new Scanner(System.in);
		
    int N = in.nextInt();
    in.close();

    int count =0;
    int copy = N;

    while(true){
      N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;

      if(copy == N){
        break;
        }
      }

      System.out.println(count);
    }
}