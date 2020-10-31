package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String... args) {

        Passport ivanovPassport = new Passport("00 12345678", "Иван", "Иванов", "Иванович", "01.01.1977", "02.02.2022", "Мид РФ" );
        Address ivanovAddress = new Address("Санкт-Петербург", "ул. Бармалеева", "10", "2");
        Person ivanov = new Person(ivanovPassport, ivanovAddress);

        Passport smithPassport = new Passport("99 87654321", "John", "Smith", "31.12.1988", "03.03.2029", "US DOS" );
        smithPassport.setMiddleName("Edvard");
        Address smithAddress = new Address("Englishtown", "S.Main Street", "5");
        Person smith = new Person(smithPassport, smithAddress);

        String ivanovFullName = ivanov.getFullName();
        String smithFullName = smith.getFullName();
        String ivanovFullAddress = ivanov.getAddress();
        String smithFullAddress = smith.getAddress();
        
        System.out.println(ivanovFullName);
        System.out.println(ivanovFullAddress);
        System.out.println(smithFullName);
        System.out.println(smithFullAddress);
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
