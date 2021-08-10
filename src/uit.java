import java.util.*;
public class uit {
    public static void main(String[] args)
    {
        int[] hr=new int[7];
        int sumhr=0,sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<7;i++)
        {
            hr[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++)
        {
            sumhr=sumhr+hr[i];
        }
        for(int i=0;i<7;i++)
        {
            if(i==0 && sumhr<=40)
            {
                sum= (int) (sum+(hr[i]*100+hr[i]*100*0.5));
            }
            if(i==6 && sumhr<=40)
            {
                sum= (int) (sum+(hr[i]*100+hr[i]*100*0.25));
            }
            if(hr[i]>8)
            {
                sum=sum+hr[i]*100;
                hr[i]=hr[i]-8;
                sum=sum+hr[i]*15;
            }
            else
            {
                sum=sum+100*hr[i];
            }
        }
        System.out.println(sum);
    }

}
