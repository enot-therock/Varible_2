public class Main {
    public static void main(String[] args) {

        System.out.println(); // вставки ради разделения задач при выводе в консоль

        System.out.println("task number 1");
        int imagine = 1500;
        double dragons = 15.0;
        short skillet = 150;
        long ledZeppelin = 15000;
        float fallOutBoy = 1.5f;
        System.out.println("Значение переменной imagine с типом int, равно " + imagine);
        System.out.println("Значение переменной dragons с типом double, равно " + dragons);
        System.out.println("Значение переменной ledZepplin с типом long, равно " + ledZeppelin);
        System.out.println("Значение переменной skillet с типом short, равно " + skillet);
        System.out.println("Значение переменной fallOutBoy с типом float, равно " + fallOutBoy);

        System.out.println();

        System.out.println("task number 2");
        float faster = 27.12f;
        long linkinPark = 987678965549L;
        double depecheMode = 2.786; // можно было использовать и float
        short sia = 569;
        short stromae = -159;
        int irma = 27897; // можно было использовть переменные от short
        int imany = 67; // можно было использовать пер-е, занимающие меньше места
        System.out.println(faster);
        System.out.println(linkinPark);
        System.out.println(depecheMode);
        System.out.println(sia);
        System.out.println(stromae);
        System.out.println(irma);
        System.out.println(imany);

        System.out.println();

        System.out.println("task number 3");
        byte luda = 23; // ученики Людмилы Павловны
        byte anna = 27; // ученики Анны Сергеевны
        byte katya = 30; // ученики Екатерины Андреевны
        short allPaper = 480; // общее количество бумаги на 3 класса
        int allKids = luda + anna + katya; // общее количество детей
        int paper = allPaper / allKids; // количество листов на одного ребенка
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

        System.out.println();

        System.out.println("task number 4");
        byte timeOne = 2; // время производства 16 бутылок из условия
        byte bottleOne = 16; // количество бутылок за первое время
        int bottleOneTime = bottleOne / timeOne; // время изготовления одной бутылки
        int bottleTwoTime = bottleOneTime * 20; // далее мы будем умножать время изготовления
        // одной бутылки на количество заданных минут
        int bottleThreeTime = bottleOneTime * 60 * 24;
        int bottleFourTime = bottleThreeTime * 3;
        int bottleFiveTime = bottleThreeTime * 30;
        System.out.println("За 1 минуту машина произвела " + bottleOneTime + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + bottleTwoTime + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleThreeTime + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleFourTime + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottleFiveTime + " штук бутылок");

        System.out.println();

        System.out.println("task number 5");
        byte white = 2;
        byte brown = 4;
        byte can = 120;
        int room = white + brown; // количество краски на один класс
        int allRoom = can / room; // количство классов в школе
        int allWhite = white * allRoom; // количество банок белой краски
        int allBrown = brown * allRoom; // количество банок коричневой краски
        System.out.println("В школе, где " + allRoom + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        System.out.println();

        System.out.println("task number 6");
        byte banan = 80; // вес одного банана, в рецепте 5 шт
        byte milk = 105; // вес 100 мл молока, в рецепте 200мл
        byte ice = 100; // вес 1 юрикета мороженого, в рецепте 2
        byte egg = 70; // вес одного яйца, в рецепте 4
        int breakfast = banan * 5 + milk * 2 + ice * 2 + egg * 4; // общий вес завтрака
        float breakfastKilo = breakfast / 1000f; // вес завтрака в килограмах
        System.out.println("Вес завтрака спортсмена " + breakfast + " гр (" + breakfastKilo + " кг).");

        System.out.println();

        System.out.println("task number 7");
        short fast = 500; // быстрое похудение
        short slow = 250; // медленное похудение
        int massa = 7 * 1000; // колличество грамм, которые необходимо сбросить
        int fastDay = massa / fast; // количество дней при похудении на 500 гр/день
        int slowDay = massa / slow; // количество дней при похудении на 250 гр/день
        int average = (fastDay + slowDay) / 2;

        System.out.println("Необходимо похудеть на " + massa + " грамм");
        System.out.println(fastDay + " дней потребуется, если худеть по 500 гр/день");
        System.out.println(slowDay + " дней потребуется, если худеть по 250 гр/день");
        System.out.println("в среднем потребуется " + average + " день");

        System.out.println();

        System.out.println("task number 8");
        int maria = 67760; // зарплата Маши в месяц
        int denis = 83690; // зарплата Дениса в месяц
        int kris = 76230; // зарплата Кристины в месяц

        float mariaPlus = 1.1f * maria; // зарплата Марии с годовой прибавкой
        float denisPlus = 1.1f * denis; // зарплата Дениса с годовой прибавкой
        float krisPlus = 1.1f * kris; // зарплата Кристины с годовой прибавкой

        float mariaYear = maria * 12; // зарплата Марии за год
        float mariaYearPlus = mariaPlus * 12; // зарплата Марии за год с 10% надбавкой
        float mariaProfit = mariaYearPlus - mariaYear; // на сколько вырос годовой доход Марии

        float denisYear = denis * 12; // зарплата Дениса за год
        float denisYearPlus = denisPlus * 12; // зарплата Дениса за год c 10% надбавкой
        float denisProfit = denisYearPlus - denisYear; // на сколько вырос годовой доход Дениса

        float krisYear = kris * 12; // зарплата Кристины за год
        float krisYearPlus = krisPlus * 12; // зарплата Кристины за год c 10% надбавкой
        float krisProfit = krisYearPlus - krisYear; // на сколько вырос годовой доход Кристины

        System.out.println("Маша теперь получает " + mariaPlus + " рублей. Годовой доход вырос на " + mariaProfit + " рублей");
        System.out.println("Денис теперь получает " + denisPlus + " рублей. Годовой доход вырос на " + denisProfit + " рублей");
        System.out.println("Кристина теперь получает " + krisPlus + " рублей. Годовой доход вырос на " + krisProfit + " рублей");

        // Можно было сделать задачу быстрее и использовать меньше памяти, но некоторые условия
        // задач, требуют пошагового решения.
    }
}