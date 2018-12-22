
//Java Runtime Polymorphism with Data Member
// Rule: Runtime polymorphism can't be achieved by data members.
// very very important

package com.test.first;

class Animal{
    String eat = "khai ";
}

class Dog extends Animal{
    String eat = " dai";
}

class BabyDog extends Dog{
    String eat = "khaoya-daoya";

    public static void main(String []args){
        Animal a1,a2,a3;
        a1=new Animal();
        a2=new Dog();
        a3=new BabyDog();

        System.out.println( a1.eat);
        System.out.println( a2.eat);
        System.out.println( a3.eat);
    }
}