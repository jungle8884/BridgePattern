package com.BridgePattern;

// 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法
class RefinedAbstractionA extends Abstraction{
    protected RefinedAbstractionA(Implementor imple){
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化(RefinedAbstractionA)角色被访问");
        imple.OperationImpl();
    }

}
