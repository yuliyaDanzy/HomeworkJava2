// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int balance = 300; // исходный баланс счета клиента
        int costBonus = 100; // стоимость одного бонуса в рублях
        int increase = 1300; // сумма пополнения счета клиента
        if (increase >= 1_000) {
            System.out.println((increase / costBonus + balance + increase) + "баланс номера с учетом бонусных начислений");
        } else {
            System.out.println((balance + increase) + "баланс номера");
        }
    }
}