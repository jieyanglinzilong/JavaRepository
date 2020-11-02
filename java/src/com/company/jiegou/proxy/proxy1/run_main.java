package com.company.jiegou.proxy.proxy1;

interface buy_car {
    public void buy_mycar();
}
class people implements buy_car {

private int cash;
private String vip;
private String username;

@Override
public void buy_mycar() {
        // TODO Auto-generated method stub
        System.out.print(username+"是vip 客户，可以直接购买新车！");
        }

public int getCash(){
        return cash;
        }
public void setCash(int cash){
        this.cash = cash;
        }
public String getUsername(){
        return username;
        }
public void setUsername(String username){
        this.username = username;
        }
public String getVip(){
        return vip;
        }
public void setVip(String vip){
        this.vip = vip;
        }
        }
class proxyclass implements buy_car {

private people people;
public people getPeople(){
        return people;
        }
public void setPeople(people people){
        this.people = people;
        }

@Override
public void buy_mycar() {
        // TODO Auto-generated method stub

        if (people.getVip() == "vip"){
        people.buy_mycar();
        return ;
        }
        if(people.getCash()>=50000){
        System.out.println(people.getUsername()+"买了新车，交易结束！");
        }
        else
        {
        System.out.println(people.getUsername()+"钱不够，不能买车，继续比赛！");
        }
        }
        }
public class run_main {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        people people_1 =new people();
        people_1.setCash(60000);
        people_1.setUsername("jeck");


        people people_2 =new people();
        people_2.setCash(40000);
        people_2.setUsername("rose");

        people people_3 =new people();

        people_3.setCash(0);
        people_3.setUsername("tom");
        people_3.setVip("vip");

        proxyclass proxy_buy = new proxyclass();
        proxy_buy.setPeople(people_1);
        proxy_buy.buy_mycar();

        proxy_buy.setPeople(people_2);
        proxy_buy.buy_mycar();

        proxy_buy.setPeople(people_3);
        proxy_buy.buy_mycar();

    }

}
