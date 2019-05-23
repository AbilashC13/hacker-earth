

import java.util.*;


class TestClass
{
    public static void main(String args[] ) throws Exception
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int q=in.nextInt();
        while(q-->0)
        {
            int w=in.nextInt(),c=0,sum=0;
            int lo=0,hi=n-1,ans=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]<=w  )
                {
                    c++;
                    sum=sum+a[i];
                    if(a[i]>=ans)
                    ans=i;
                }
            }
            System.out.println(c+" "+sum);
        }
    }
}
