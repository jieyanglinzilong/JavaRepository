package com.company.fatory;
abstract class BMW {
    public BMW(){

    }
}
 class BMW320 extends BMW {
    public BMW320() {
        System.out.println("制造-->BMW320");
    }
}
 class BMW523 extends BMW{
    public BMW523(){
        System.out.println("制造-->BMW523");
    }
}
interface FactoryBMW {
    BMW createBMW();
}

class FactoryBMW320 implements FactoryBMW{

    @Override
    public BMW320 createBMW() {

        return new BMW320();
    }

}
 class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {

        return new BMW523();
    }
}
public class fatory {
    public static void main(String args[]){
    FactoryBMW320 factoryBMW320 = new FactoryBMW320();
    BMW320 bmw320 = factoryBMW320.createBMW();
     FactoryBMW523 factoryBMW523 = new FactoryBMW523();
    BMW523 bmw523 = factoryBMW523.createBMW();}
}
