package com.company.jiegou.门面模式.facade1;
 class Module {
    /**
     * 提供给子系统外部使用的方法
     */
    public void a1(){};

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void a2(){};
    private void a3(){};
}
 class ModuleB {
    /**
     * 提供给子系统外部使用的方法
     */
    public void b1(){};

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void b2(){};
    private void b3(){};
}
 class ModuleC {
    /**
     * 提供给子系统外部使用的方法
     */
    public void c1(){};

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void c2(){};
    private void c3(){};
}
 class ModuleFacade {

    Module a = new Module();
    ModuleB b = new ModuleB();
    ModuleC c = new ModuleC();
    /**
     * 下面这些是A、B、C模块对子系统外部提供的方法
     */
    public void a1(){
        a.a1();
    }
    public void b1(){
        b.b1();
    }
    public void c1(){
        c.c1();
    }
}
public class Client {

    public static void main(String[] args) {

        ModuleFacade  facade = new ModuleFacade();
        facade.a1();
        facade.b1();
        facade.c1();
    }

}
