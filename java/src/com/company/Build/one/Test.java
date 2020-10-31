package com.company.Build.one;



class Man {
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

     @Override
     public String toString() {
         return "Man{" +
                 "head='" + head + '\'' +
                 ", body='" + body + '\'' +
                 ", foot='" + foot + '\'' +
                 '}';
     }

     public String getFoot() {
        return foot;
    }
    public void setFoot(String foot) {
        this.foot = foot;
    }

}


class ManBuilder {
    Man man;
    public ManBuilder() {
        man = new Man();
    }
    public void buildbody() {
        man.setBody("男人的身体");
    }
    public void buildFoot() {
        man.setFoot("男人的脚");
    }
    public void buildHead() {
        man.setHead("男人的头");
    }
    public Man builderMan() {
        buildHead();
         buildbody();
         buildFoot();
        return man;
    }
}
public class Test {
     public static void main(String args[]) {
         ManBuilder builder = new ManBuilder();
         Man man = builder.builderMan();
         System.out.println(man.toString());
     }
}
