package SNAKELADDER;

import java.util.Random;

public class Game
{
    public static void main(String[] args) {
        int [][] arr = {{12,35},{25,45},{67,98},{99,50},{87,39},{63,18}};
        int p1=0,p2=0;

        boolean flag=true;
        Random r=new Random();
//        while(true)
//        {
//            int next=r.nextInt(1,7);
//            if(flag)
//            {
//                int temp1=p1;
//                p1+=next;
//                if(p1>100)
//                {
//                    p1=temp1;
//
//                }
//                System.out.println("dice---->"+p1);
//                flag=false;
//            }
//            else
//            {
//                int temp2=p2;
//                p2+=next;
//                if(p2>100)
//                {
//                    p1=temp2;
//                }
//                System.out.println("dice---->"+p2);
//                flag=true;
//            }
//            for(int i=0;i< arr.length;i++)
//            {
//                for(int j=0;j<arr[i].length;j++)
//                {
//                    if(arr[i][0]==p1)
//                    {
//                        p1=arr[i][j];
//                        System.out.println("position of p1"+p1);
//                    }
//                    if(arr[i][0]==p2)
//                    {
//                        p2=arr[i][j];
//                        System.out.println("position of p2"+p2);
//                    }
//                    if(p1==100)
//                    {
//                        System.out.println("P1 wins");
//                        System.exit(0);
//                    }
//                    if (p2==100)
//                    {
//                        System.out.println("P2 wins");
//                        System.exit(0);
//                    }
//                }
//            }
//        }

        while (true){
            int dice=r.nextInt(1,7);
            if(flag)
            {
                p1 += dice;
                for(int i=0;i< arr.length;i++){
                    if(p1==arr[i][0])
                        p1=arr[i][1];
                }
                if(p1>100)
                    p1-=dice;
                System.out.println("the player one position is "+p1);
            }
            else
            {
                p2 += dice;
                for(int i=0;i< arr.length;i++){
                    if(p2==arr[i][0])
                        p2=arr[i][1];
                }
                if(p2>100)
                    p2-=dice;
                System.out.println("the player two position is "+p2);
            }
            if(p1==100){
                System.out.println("player one wins");
                break;
            }
            if(p2==100){
                System.out.println("player two wins");
                break;
            }
            System.out.println("------------------------------------");
        }

    }
}
