import java.util.*;
public class topper {
    public static void main(String[] args)
    {
        int number,evens=0,odds=0,k;
        Scanner sc=new Scanner(System.in);
        number =sc.nextInt();
        while(number >0)
        {
            k= number %10;
            if(k%2==0)
            {
                evens=evens+k;
            }
            else
                odds = odds + k;
            number = number /10;
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

