package DesignPrinciples;

//interface old
//{
//    public void method1();
//    public void method12();
//}

interface one
{
    public void method1();
}
interface two
{
    public void method2();
}


public class SOLID_ISP implements one
{
    public static void main(String[] args) {
        one obj1=new SOLID_ISP();
        obj1.method1();
    }

    @Override
    public void method1() {
        System.out.println("Only one method was required so old interface is split into 2 sub interface and according " +
                "to the requirement it will be implemented");
    }
}
