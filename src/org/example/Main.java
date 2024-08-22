package org.example;

public class Main {
    public static void main(String[] args) {
        Sotrudnik sotrudnik = new Sotrudnik("Сухарев Владимир Петрович", "инженер", "vovan and lexus@mail.ru",
                "8925341986", 250000, 60);
        sotrudnik.monitorInfo();

        //Создание массивов сотрудников
        Sotrudnik[] sotrudniks = new Sotrudnik[5];
        sotrudniks[0] = new Sotrudnik("Петров Иван Петрович", "Директор","director@mail.ru",
                "89028896532",4000_000,10);
        sotrudniks[1] = new Sotrudnik("Василькова Лидия ПЕтровна", "Стропальшица","strr@mail.ru",
                "89263001808",40_000,50);
        sotrudniks[2] = new Sotrudnik("Меньшиво сергей Иванович", "Директор закупок","director-2@mail.ru",
                "89001909000",2000_000,50);
        sotrudniks[3] = new Sotrudnik("Гертруда Светлана Петровна", "Бухгалтер","buhgalterr@mail.ru",
                "89123182030",600_000,30);
        sotrudniks[4] = new Sotrudnik("Петров Дмитрий  Петрович", "Менеджер","manager@mail.ru",
                "89991991999",1000_000,38);


        Park park = new Park();
        Park.Atraction atraction1 = park.new Atraction("Кривые зеркала",6, 150,100);
        Park.Atraction atraction2 = park.new Atraction("Стелла",14, 150,1000);
        atraction1.monitorInfo1();
        System.out.println();
        atraction2.monitorInfo1();


    }

}