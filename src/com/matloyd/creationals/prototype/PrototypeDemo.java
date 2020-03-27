package com.matloyd.creationals.prototype;


public class PrototypeDemo {

    public static void main(String[] args) {
        Statement statement = Statement.getBuilder()
                .setFrom(" from employee")
                .setProjection("select firstName, lastName")
                .setWhere(" where id=12")
                .setRecord(new Record())
                .createStatement();

        System.out.println(statement.hashCode());
        System.out.println(statement.getRecord().hashCode());

        Statement clone = statement.clone();
        System.out.println(clone.hashCode());
        System.out.println(clone.getRecord().hashCode());
    }
}
