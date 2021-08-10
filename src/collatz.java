import java.util.*;
public class collatz {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=1)
        {
            if(n%2==0)
            {
                System.out.println(n/2);
                n=n/2;
            }
            else
            {
                System.out.println((3*n)+1);
                n=3*n+1;
            }
        }

    }
}
