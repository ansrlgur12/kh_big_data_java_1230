package _0205_시험공부;

public abstract class Animal {
    public abstract void cry();
}

class Cat extends Animal {

    @Override
    public void cry() {
        System.out.println("야옹.");
    }
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("멍멍.");
    }
}