package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */

public class Passport {
    private String fullPassportNumber;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String middleName;
    private String birthDate;
    private String passportIssueDate;
    private String passportAuthority;
    
    public Passport(String fullPassportNumber, String firstName, String lastName, String birthDate, String passportIssueDate, String passportAuthority) {
        this.fullPassportNumber = fullPassportNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.passportIssueDate = passportIssueDate;
        this.passportAuthority = passportAuthority;
    }

    public Passport(String fullPassportNumber, String firstName, String lastName, String patronymic, String birthDate, String passportIssueDate, String passportAuthority) {
        this(fullPassportNumber, firstName, lastName, birthDate, passportIssueDate, passportAuthority);
        this.patronymic = patronymic;
    }
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    public String getFullPassportNumber() {
        return fullPassportNumber;
    }

    public void setFullPassportNumber(String fullPassportNumber) {
        this.fullPassportNumber = fullPassportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.middleName = null;
        this.patronymic = patronymic;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.patronymic = null;
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(String passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    public String getPassportAuthority() {
        return passportAuthority;
    }

    public void setPassportAuthority(String passportAuthority) {
        this.passportAuthority = passportAuthority;
    }
}