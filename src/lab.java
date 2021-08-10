import java.util.*;
public class lab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] labcap=new int[3];
        int min=99999,diff,index=0,c=0;
        for(int i=0;i<3;i++)
        {
            labcap[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        for(int i=0;i<3;i++)
        {
            if(labcap[i]>=n)
            {
                diff=labcap[i]-n;
                c=c+1;
                if(min>=diff)
                {
                    min=diff;
                    index=i;
                }
            }
        }
        if(index==0 && c>0)
        {
            System.out.println("X");

        }
        if(index==1 )
        {
            System.out.println("Y");

        }
        if(index==2 )
        {
            System.out.println("Z");

        }
        if(index==0)
        {
            System.out.println("No lab is available");
        }
    }

}
