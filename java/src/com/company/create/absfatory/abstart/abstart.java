package com.company.create.absfatory.abstart;
//发动机以及型号
interface Engine {

}
//空调以及型号
interface Aircondition {

}
//创建工厂的接口
interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Aircondition createAircondition();
}
 class EngineA implements Engine {
    public EngineA(){
        System.out.println("制造-->EngineA");
    }
}
class EngineB implements Engine {
    public EngineB(){
        System.out.println("制造-->EngineB");
    }
}


class AirconditionA implements Aircondition {
    public AirconditionA(){
        System.out.println("制造-->AirconditionA");
    }
}
 class AirconditionB implements Aircondition {
    public AirconditionB(){
        System.out.println("制造-->AirconditionB");
    }
}




//为宝马320系列生产配件
 class FactoryBMW320 implements AbstractFactory{


    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
//宝马523系列
class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }


}



public class abstart {
    public static void main(String[] args){
        //生产宝马320系列配件
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();

        //生产宝马523系列配件
        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();
    }
}