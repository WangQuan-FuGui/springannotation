package com.dream.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("${os.name}")
    private String name;
    /**
     * "张函"直接写值
     * #{}spEl表达式
     * ${}从配置文件中获取值(运行环境中的值和propertis文件中的值)
     */
    @Value("#{20-1}")
    private Integer age;

    @Value("${person.nickName}")
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
