package DesignPrinciples;

interface calculator
{
    public void add();
}
class Add2Nos implements calculator
{
    private int a,b;
    @Override
    public void add() {
        System.out.println(a+b);
    }
    public Add2Nos(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
class Add3Nos implements calculator
{
    private int a,b,c;
    @Override
    public void add() {
        System.out.println(a+b);
        System.out.println("A new feature is added by extending and not by modifyingS");
    }

    public Add3Nos(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
}

public class SOLID_openclose
{
    public static void main(String[] args) {
        Add2Nos ob1=new Add2Nos(4,6);
        ob1.add();
        Add3Nos ob2=new Add3Nos(1,2,3);
        ob2.add();

    }
}
