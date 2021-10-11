package zinga;

public class Hello {
    public void sayHello(String name){
        System.out.println("Hello, my name is " + name + "!");
    }
    public static void main(String[] args){
        Hello hello = new Hello();
        hello.sayHello( "Francisco");
        System.out.println("Hello Francisco, my name is Sanele");

    }
}
