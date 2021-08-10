import java.util.*;
public class topper {
    public static void main(String[] args)
    {
        int n,evens=0,odds=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            k=n%10;
            if(k%2==0)
            {
                evens=evens+k;
            }
            else
                odds = odds + k;
            n=n/10;
        }
        if(evens==odds)
        {
            System.out.print("Topper");
        }
        else
        {
            System.out.println("Not Topper");
        }
    }
}

