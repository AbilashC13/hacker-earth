import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String[] tmp = br.readLine().split(" ");
         int N, K;
         N = Integer.parseInt(tmp[0]);
         K = Integer.parseInt(tmp[1]);
         
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         long out_ = Queries(A, K, N);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static long Queries(int[] A, int K,int N){
        // Write your code here
        for(int i=0;i<N;i++)
        {
            int x=0;
            for(int j=i;j<N;j++)
            {
                x=x+A[j];
                if(x>K)
                {
                    x-=A[j];
                    break;
                }
            }
            A[(i+x)%N]=K^x;
        }
        long sum=0;
        for(int i=0;i<N;i++)
            sum+=A[i];
    
    return sum;
    
    }
}
