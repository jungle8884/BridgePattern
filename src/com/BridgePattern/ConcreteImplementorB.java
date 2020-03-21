package com.BridgePattern;

// 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现
class ConcreteImplementorB implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(ConcreteImplementorB)角色被访问");
    }
}
