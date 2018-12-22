package com.test.first;

public class Eat {
    void eat(){System.out.println("eating");}
}
class FruitEating extends Eat{
    void eat(){System.out.println("eating fruits");}
}
class BabyFruitEating extends FruitEating{
    void eat(){System.out.println("drinking milk");}
    public static void main(String []args){
        Eat a1,a2,a3;
        a1=new Eat();
        a2=new FruitEating();
        a3=new BabyFruitEating();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}