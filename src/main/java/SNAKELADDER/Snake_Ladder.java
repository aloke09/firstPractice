package SNAKELADDER;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Snake_Ladder
{
    public static void main(String[] args) {

        Map<Integer,Integer> m=new HashMap<>(){{
            put(13, 49);
            put(50, 40);
            put(9, 90);
            put(15, 45);
            put(25, 79);
            put(99, 100);
        }};


        int p1=0,p2=0;
        Random r=new Random();
        boolean flag=true;
        while (true){
            int dice=r.nextInt(1,7);
            if(flag)
            {
                p1 += dice;
                if(m.containsKey(p1))
                    p1=m.get(p1);
                if(p1>100)
                    p1-=dice;
                System.out.println("the player one position is "+p1);
                flag=false;
            }
            else
            {
                p2 += dice;
                if(m.containsKey(p2))
                    p2=m.get(p2);
                if(p2>100)
                    p2-=dice;
                System.out.println("the player two position is "+p2);
                flag=true;
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
