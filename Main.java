/* 1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.*/

package lesson6;

public class Main {
    public static void main (String[] args){
        Dog dog = new Dog ("Бобик", 150);
        Cat cat = new Cat ("Барсик", 80);
        Dog dog2 = new Dog("Стрелка", 250);
        Cat cat2 = new Cat("Белка", 130);


        Animal[] animals = {dog, dog2, cat, cat2};

        for(Animal animal : animals){
            animal.printInfo();
            animal.doAction();
        }
    }
}
