
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass
{
    public static int  check(int mid,int a[],int n)
        {
            int sum=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]-mid>=0)
                sum+=a[i]-mid;
            }
            return sum;
        }
    public static void main(String args[] ) throws Exception 
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int X=in.nextInt();
        int a[]=new int[n],c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int lo=0,hi=100000,ans=0;
        while(lo<=hi)
        {
            int mid=lo+hi>>1;
            int res=check(mid,a,n);
            if(res<X)
            {
                hi=mid-1;
                
            }
            else
            {
                if(res>=X && mid>ans)
                {
                ans=mid;
                
                }
                lo=mid+1;
            }
        }
    System.out.println(ans);
        
    }
}
