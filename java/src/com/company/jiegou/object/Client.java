package com.company.jiegou.object;
interface Target{
    public void request();
}
class adapter1 implements  Target{
    public adapter1(){

    }

    @Override
    public void request() {
        System.out.println("adater1 设配器工作");
    }
}
class adapter2 implements Target{

    public adapter2(){

    }

    @Override
    public void request() {
        System.out.println("adater2 设配器工作");
    }
}




public class Client {
    public static void main(String args[]){
        Target target1 = new adapter1();
        target1.request();
        Target target = new adapter2();
        target.request();
    }
}
