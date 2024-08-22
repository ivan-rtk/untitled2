package org.example;

public class Park {
    //Внутреннний класс атракцион
    public class Atraction{
        private String name;
        private Integer age;// ограничение по возрасту
        private Integer weight;// ограничение по весу
        private double cost; // стоимость билета

        //конструктор класса//
        public Atraction(String name, Integer age, Integer weight,double cost){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.cost = cost;
        }
        //Метод вывода информации об атракционе
        public void monitorInfo1(){
            System.out.println("Имя" + name);
            System.out.println("Возраст" + age);
            System.out.println("Вес" + weight);
            System.out.println("Стоимость билета" + cost);
        }
    }
}
