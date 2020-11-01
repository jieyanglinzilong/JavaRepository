package com.company.create.absfatory.Build;




interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
 class Person {
    private String head;
    private String body;
    private String foot;

    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getFoot() {
        return foot;
    }
    public void setFoot(String foot) {
        this.foot = foot;
    }
}
 class Man extends Person {
    public Man(){
        System.out.println("开始建造男人");
    }
}
 class Woman extends Person {
    public Woman(){
        System.out.println("开始建造女人");
    }
}
class ManBuilder implements PersonBuilder {
    Person person;
    public ManBuilder() {
        person = new Man();
    }
    public void buildbody() {
        person.setBody("建造男人的身体");
    }
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }
    public void buildHead() {
        person.setHead("建造男人的头");
    }

    @Override
    public void buildBody() {

    }

    public Person buildPerson() {
        return person;
    }
}
 class WomanBuilder implements PersonBuilder {
    Person person;
    public WomanBuilder() {
        person = new Woman();
    }
    public void buildbody() {
        person.setBody("建造女人的身体");
    }
    public void buildFoot() {
        person.setFoot("建造女人的脚");
    }
    public void buildHead() {
        person.setHead("建造女人的头");
    }

     @Override
     public void buildBody() {

     }

     public Person buildPerson() {
        return person;
    }
}
 class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
public class Test2{
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person womanPerson = pd.constructPerson(new ManBuilder());
        Person manPerson = pd.constructPerson(new WomanBuilder());
    }
}
