package com.BridgePattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();

        imple =new ConcreteImplementorB();
        abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
