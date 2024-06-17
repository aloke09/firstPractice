package DesignPrinciples;

public class SOLID_SRP {
    public static void main(String[] args) {
        Withfunctionality objSRP=new Withfunctionality();
        objSRP.method1();
    }
}
class Withfunctionality
{
    public void method1()
    {
        System.out.println("This is an example of SRP");
    }

//    public Withfunctionality() {
//    }
}
