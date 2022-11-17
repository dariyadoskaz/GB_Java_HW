package lesson5;

public class Main {
    public static void main (String[] args) {
        Employee[] empsArray = new Employee[5];
        empsArray[0] = new Employee("Dolores Abernathy", "Designer", "westworld@email.com", +1234567890, 4000, 35);
        empsArray[1] = new Employee("Arnold Weber", "Creator", "westworld@email.com", +1234567890, 2000, 63);
        empsArray[2] = new Employee("Robert Ford", "Manager","westworld@email.com", +1234567890, 3000, 58 );
        empsArray[3] = new Employee("Charlotte Hale", "Director","westworld@email.com", +1234567890, 5000, 34);
        empsArray[4] = new Employee("Maeve Millay", "Host", "westworld@email.com", +1234567890, 1000, 41);


        for (Employee employee : empsArray) {
            employee.printInfo();
        }

        for (int i = 0; i < empsArray.length; i++) {
            if (empsArray[i].getAgeoverforty() > 40) {
                empsArray[i].printInfo();
            }
        }
    }
}
