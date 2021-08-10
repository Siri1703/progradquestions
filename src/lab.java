import java.util.*;
public class lab {
    public static void main(String[] args) {
        int[] la=new int[3];
        int index=0,min=9999,diff,c=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            la[i]=sc.nextInt();
        }

        int n=sc.nextInt();
        for(int i=0;i<3;i++)
        {
            if(la[i]>=n) {
                c=c+1;
                diff = la[i] - n;
                if (min >= diff) {
                    min = diff;
                    index = i;
                }
            }
        }
        if(index==0 && c>0)
        {
            System.out.println("X");
        }
        if(index==1)
        {
            System.out.println("y");
        }
        if(index==2)
        {
            System.out.println("Z");
        }
    }
}
