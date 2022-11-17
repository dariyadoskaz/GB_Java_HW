package lesson5;

/* 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class Employee {
    private String name;
    private String position;
    private String email;
    private int tel;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, int tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo () {
        System.out.println(String.format( "Employee %s (age: %s) on a position of %s has the %s $ salary. The contact info on %s or text to %s", name, age, position, salary, tel, email ));
    }

    public int getAgeoverforty(){
        return age;
    }

}
