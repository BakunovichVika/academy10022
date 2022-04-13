package by.academy.shop;

import java.util.Scanner;

public class User {
    protected int age;
    protected String name;
    protected double money;
    protected String dateOfBirth;
    protected String phone;
    protected String email;

    protected User () {
        super();
    }

    protected User(int age, String name, double money) {
        this.age = age;
        this.money = money;
        this.name = name;

        System.out.println("Введите Вашу дату рождения:");

        Scanner sc = new Scanner(System.in);
        this.dateOfBirth = sc.nextLine();

        if (Regex.checkdate(dateOfBirth) == true) {
            System.out.println("Дата соответствует формату");
        } else if (Regex.checkdate(dateOfBirth) == false) {
            System.out.println("Дата не соответствует формату!");
            while (Regex.checkdate(dateOfBirth) == false) {
                System.out.println("Введите дату формата: dd/MM/yyyy или dd-MM-yyyy");
                dateOfBirth = sc.nextLine();
            }
        }

        System.out.println("Введите Ваш белорусский номер телефона:");

        Scanner scanner = new Scanner(System.in);
        this.phone = scanner.nextLine();

        if (Regex.checkBelarus(phone) == true) {
            System.out.println("Номер соответствует формату");
        } else if (Regex.checkBelarus(phone) == false) {
            System.out.println("Номер не соответствует формату!");
            while (Regex.checkBelarus(phone) == false) {
                System.out.println("Введите Номер формата: +375.........");
                phone = scanner.nextLine();
            }
        }

        System.out.println("Введите Вашу почту:");

        Scanner scan = new Scanner(System.in);
        this.email = scan.nextLine();

        if (Regex.checkEmail(email) == true) {
            System.out.println("Почта соответствует формату");
        } else if (Regex.checkEmail(email) == false) {
            System.out.println("Почта не соответствует формату!");
            while (Regex.checkEmail(email) == false) {
                System.out.println("Введите почту необходимого формата!");
                email = scan.nextLine();
            }
        }
    }
        //        SimpleDateFormat dateFormat = new SimpleDateFormat("d.MMMM.yyyy");
//        System.out.println("День: " + dateFormat.format(dateOfBirth));

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
