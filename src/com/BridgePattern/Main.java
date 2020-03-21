package com.BridgePattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Implementor imple = new ConcreteImplementorA();
        Abstraction absA = new RefinedAbstractionA(imple);
        absA.Operation();
        imple =new ConcreteImplementorB();
        absA = new RefinedAbstractionA(imple);
        absA.Operation();

        imple = new ConcreteImplementorA();
        Abstraction absB = new RefinedAbstractionB(imple);
        absB.Operation();
        imple =new ConcreteImplementorB();
        absB = new RefinedAbstractionA(imple);
        absB.Operation();
    }
}
