import java.util.*;
class pp1
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();//input
        String s=Integer.toString(N);
        int p=N; int c=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char r=s.charAt(i);
            s=s.substring(1,l)+r;
            System.out.println(s);
            if(prime(s)==true)
            c++;
        }
        System.out.println(c);
        //if (c==l)
        //System.out.println(p+"IS A CIRCULAR NUMBER");
        //loop front to back
        //   {//boolean calling}
        //if 
    }
    static boolean prime(String x) 
    {
        Integer a=Integer.valueOf(x); 
        int r=0;
        for(int i=1;i<a;i++)
        {
            int j=a%i;
            if(j==0)
            r++;
        }
        if(r==2)
        return true;
        else 
        return false;
    }
}