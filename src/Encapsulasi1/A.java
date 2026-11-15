package Encapsulasi1;

public class A {
    private int lebar;
    public int panjang;
    protected int luas;
    
    public void display() {
        lebar = 8;
        panjang = 9;
        luas = lebar * panjang;
        System.out.println("LUAS PERSEGI");
        System.out.println(luas);
    }
}

class B {
    public static void main(String args[]) {
        A obj = new A();
        obj.display();
    }
}
