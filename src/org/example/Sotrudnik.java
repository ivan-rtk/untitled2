package org.example;

public class Sotrudnik {
    private String fio;
    private String employee;
    private String email;
    private String phone;
    private Integer salary;
    private Integer age;


    //конструктор класса//
    public Sotrudnik(String fio, String employee, String email, String phone,
                     Integer salary, Integer age) {

        this.fio = fio;
        this.employee = employee;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    //Метод для вызова полной информации об объекте
    public void monitorInfo(){
        System.out.println("ФИО" + fio);
        System.out.println("Должность" + employee);
        System.out.println("email" + email);
        System.out.println("Телефон" + phone);
        System.out.println("Зарплата" + salary);
        System.out.println("Взраст" + age);

    }

}








/*            String name = "Владимир";
            String employee = "ingener";
            String email = "email.ru";
            Integer phone = 89_999_999_999;
            Integer salary = 250000;
            Integer age = 26 ;*/
/*
public String name ;
public String employee;
public String email;
public Integer phone;
public Integer salary;
public Integer age ;{
        System.out.println("это шняга какая то");
employee = "fuck";
age = 633;*/
