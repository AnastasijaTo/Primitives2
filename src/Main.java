public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int bonusClient = 100;
        int allAmount = 1200;

        int bonus;

        if (allAmount >= 1000) {
            bonus = allAmount / bonusClient;
        } else {
            bonus = 0;
        }

        int Account = clientAccount + allAmount + bonus;

        System.out.println("При пополнении баланса на сумму" + allAmount + "руб. бонус составил сумму" + bonus + "руб. Ваш баланс" + Account + "руб.");
    }
}
