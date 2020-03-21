package com.BridgePattern;

// 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法
public class RefinedAbstractionB extends Abstraction {
    protected RefinedAbstractionB(Implementor imple){
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(RefinedAbstractionB)角色被访问");
        imple.OperationImpl();
    }
}
