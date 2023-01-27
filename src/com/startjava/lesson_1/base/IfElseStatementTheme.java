package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1.Перевод псевдокода на язык Java");
        int age = 20;
        double height = 1.93;
        String gender = "man";
        if (age > 20) {
            System.out.println("Ты уже поменял паспорт");
        } else {
            System.out.println("Тебе нужно будет менять паспорт в 20 лет");
        }
        if (gender != "man") {
            System.out.println("Ты женщина");
        } else {
            System.out.println("Ты мужчина");
        }
        if (height < 1.80) {
            System.out.println("Ты низкий");
        } else {
            System.out.println("Ты высокий");
        }
        char capitalLetter = "Liza".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Твое имя начинается на букву  M");
        } else if (capitalLetter == 'I') {
            System.out.println("Твое имя начинается на букву I");
        } else {
            System.out.println("Твое имя начинается на другую букву");
        }

        System.out.println("\n2.Поиск max и min числа");
        int number1 = 3;
        int number2 = 2;
        if (number1 == number2) {
            System.out.println("Числа равны");
        } else if (number1 > number2) {
            System.out.println(number1 + " - max" + " " + number2 + " - min");
        } else {
            System.out.println(number2 + " - max" + " " + number1 + " - min");
        }

        System.out.println("\n3.Проверка числа");
        int number3 = 3;
        System.out.println("Исходное число - " + number3 + "\nЯвляется : ");
        if (number3 != 0) {
            if (number3 % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
            if (number3 > 0) {
                System.out.println("положительным");
            } else {
                System.out.println("отрицательным");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int numbers1 = 164;
        int numbers2 = 165;
        System.out.println("Исходные числа: " + numbers1 + " " + numbers2);
        int hundredsOfNum1 = numbers1 / 100;
        int tensOfNum1 = numbers1 / 10 % 10;
        int onesOfNum1 = numbers1 % 10;
        int hundredsOfNum2 = numbers2 / 100;
        int tensOfNum2 = numbers2 / 10 % 10;
        int onesOfNum2 = numbers2 % 10;
        if (hundredsOfNum1 == hundredsOfNum2) {
            System.out.println("Числа : " + hundredsOfNum1 + " и " + hundredsOfNum2 
                    + " в разряде сотни равны");
        }
        if (tensOfNum1 == tensOfNum2) {
            System.out.println("Числа : " + tensOfNum1 + " и " + tensOfNum2 
                    + " в разряде десятки равны");
        }
        if (onesOfNum1 == onesOfNum2) {
            System.out.println("Числа : " + onesOfNum1 + " и " + onesOfNum2 
                    + " в разряде единицы равны");
        }
        if (hundredsOfNum1 != hundredsOfNum2 && tensOfNum1 != tensOfNum2 && onesOfNum1 != onesOfNum2) {
            System.out.println("Равных цифр нет");
        }

        System.out.println("\n5.Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println(symbol + " это маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println(symbol + " это большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println(symbol + " это число");
        } else {
            System.out.println(symbol + " не буква и не число");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percentagePerYear = 10;
        System.out.println(deposit);
        if (deposit < 100_000) {
            percentagePerYear = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percentagePerYear = 7;
        }
        int percentageGet = deposit / 100 * percentagePerYear;
        System.out.println("Начисленный процент : " + percentageGet 
                + "\nИтоговая сумма с % = " + (deposit + percentageGet));

        System.out.println("\n7.Определение оценки по предметам");
        int historyPercentage = 59;
        int programmingPercentage = 91;
        int historyGrade = 2;
        int programmingGrade = 2;
        if (historyPercentage > 91) {
            historyGrade = 5;
        } else if (historyPercentage > 73) {
            historyGrade = 4;
        } else if (historyPercentage > 60) {
            historyGrade = 3;
        }
        if (programmingPercentage > 91) {
            programmingGrade = 5;
        } else if (programmingPercentage > 73) {
            programmingGrade = 4;
        } else if (programmingPercentage > 60) {
            programmingGrade = 3;
        }
        System.out.println("История : " + historyGrade + "\nПрограммирование : " + programmingGrade);
        int averageGrade = (historyGrade + programmingGrade) / 2;
        int averagePercentage = (historyPercentage + programmingPercentage) / 2;
        System.out.println("Средняя балл оценок по предметам - " + averageGrade 
                + "\nСредний % по предметам - " + averagePercentage);

        System.out.println("\n8.Расчет прибыли за год");
        int roomRent = 5000;
        int goodsSell = 13000;
        int goodsPrice = 9000;
        int profit = (goodsSell - (goodsPrice + roomRent)) * 12;
        if (profit > 0) {
            System.out.println("+" + profit);
        } else {
            System.out.println(profit);
        }

        System.out.println("\n9.Подсчет количества банкнот");
        int moneyRemoved = 567;
        int numberNominalStock100 = 10;
        int numberNominalStock10 = 5;
        int numberNominalStock1 = 50;
        int needNumberBanknoteNominal100 = moneyRemoved / 100;
        int needNumberBanknoteNominal10 = moneyRemoved / 10 % 10;
        int needNumberBanknoteNominal1 = moneyRemoved % 10;
        System.out.println("Номиналы банкнот : 1 , 10 , 100");
        if (needNumberBanknoteNominal100 <= numberNominalStock100) {
            System.out.println("Выдаем " + needNumberBanknoteNominal100 + " номиналом 100");
        } else {
            needNumberBanknoteNominal10 = (needNumberBanknoteNominal100 - numberNominalStock100) 
                    * 10 + needNumberBanknoteNominal10;
            needNumberBanknoteNominal100 = numberNominalStock100;
            System.out.println("Выдаем " + needNumberBanknoteNominal100 + " номиналом 100");
        }
        if (needNumberBanknoteNominal10 <= numberNominalStock10) {
            System.out.println("Выдаем " + needNumberBanknoteNominal10 + " номиналом 10");
        } else {
            needNumberBanknoteNominal1 = (needNumberBanknoteNominal10 - numberNominalStock10) 
                    * 10 + needNumberBanknoteNominal1;
            needNumberBanknoteNominal10 = numberNominalStock10;
            System.out.println("Выдаем " + needNumberBanknoteNominal10 + " номиналом 10");
        }
        if (needNumberBanknoteNominal1 <= numberNominalStock1) {
            System.out.println("Выдаем " + needNumberBanknoteNominal1 + " номиналом 1");
        } else {
            System.out.println("банкнот не хватает для выдачи нужной суммы");
        }
        int checksum = (needNumberBanknoteNominal100 * 100) 
                + (needNumberBanknoteNominal10 * 10) + (needNumberBanknoteNominal1 * 1);
        System.out.println("Выдаваемая сумма " + checksum + " USD");
    }
}