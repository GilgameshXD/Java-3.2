public class Main {
    public static void main(String[] args) {

        int currentbalance = 100;                   // Объявляете переменные для входных данных и
        int topupamount = 1100;                      // параметров программы: начального счёта,
        int minimumlimitforbonus = 1000;            // суммы пополнения и тп
        int newbalance;
        int bonuses = 0;

        if (topupamount > minimumlimitforbonus) {                                                            // Условным оператором проверяете, превысила ли
            newbalance = currentbalance + topupamount + topupamount / 100;                                   // сумма пополнения порог, и для этих двух разных
            bonuses = topupamount / 100;                                                                     // сценариев рассчитываете сумму бонуса и выводите
        } else {                                                                                             // на экран.
            newbalance = currentbalance + topupamount;
        }
        System.out.println("Ваш баланс: " + newbalance + " рубль(-ей)" + "\nБонусов зачислено: " + bonuses);
    }
}