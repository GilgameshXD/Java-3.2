public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;                   // Объявляете переменные для входных данных и
        int topUpAmount = 1100;                      // параметров программы: начального счёта,
        int minimumLimitForBonus = 1000;            // суммы пополнения и тп
        int newBalance;
        int bonuses = 0;

        if (topUpAmount > minimumLimitForBonus) {                                                            // Условным оператором проверяете, превысила ли
            newBalance = currentBalance + topUpAmount + topUpAmount / 100;                                   // сумма пополнения порог, и для этих двух разных
            bonuses = topUpAmount / 100;                                                                     // сценариев рассчитываете сумму бонуса и выводите
        } else {                                                                                             // на экран.
            newBalance = currentBalance + topUpAmount;
        }
        System.out.println("Ваш баланс: " + newBalance + " рубль(-ей)" + "\nБонусов зачислено: " + bonuses);
    }
}