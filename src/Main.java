import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int savings = 0;
        int month = 0;

        while(savings < 2_459_000) {
            savings += savings * 0.01;
            savings += 15000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings);
        }

        System.out.println("Task 2");

        int i = 0;

        while(i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();

        for( ;i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Task 3");

        int allPeople = 12_000_000;

        for(int year = 1; year <= 10; year++) {
            int growth = (allPeople/1000) * (17-8);
            allPeople = allPeople + growth;
            System.out.println("Год " + year + ", численность населения составляет " + allPeople);
        }

        System.out.println("Task 4/5");

        savings = 15000;
        month = 0;
        while (savings < 12_000_000) {
            savings += savings * 0.07;
            month++;
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", накоплено " + savings);
            }
        }

        System.out.println("Task 6");

        savings = 15000;
        month = 0;
        while (month <= 9*12) {
            savings += savings * 0.07;
            month++;
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", накоплено " + savings);
            }
        }

        System.out.println("Task 7");

        int friday = 5;

        while (friday < 31) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчёт.");
                friday += 7;
        }

        System.out.println("Task 8");

        int currentYear = 0;
        int year = 2025;
        int past = year - 200;
        int future = year + 100;

        for ( ; currentYear <= future; currentYear++) {
            boolean period = (currentYear > past && currentYear < future);
            if (period && currentYear % 79 == 0) {
                System.out.println(currentYear);
            }
        }
    }
}