package com.startjava.lesson_1.base;

class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод значений переменных на консоль");
        byte core = 4;
        short cpu = 1;
        int graphicsCard = 1;
        long files = 123748484;
        float cpuSpeed = 4.8f;
        double ramSpeed = 1.8;
        char model = 'V';
        System.out.println(core + " - количество ядер");
        System.out.println(cpu + " - количество процессоров") ;
        System.out.println(graphicsCard + " - количество видеокарт") ;
        System.out.println(files + " - Количество файлов на ПК ") ;
        System.out.println(cpuSpeed + " - частота процессора");
        System.out.println(ramSpeed + " - частота оперативной памяти") ;
        System.out.println(model + " - модель") ;

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int goodsPrice = penPrice + bookPrice;
        int discount = goodsPrice / 100 * 11;
        int discountPrice = goodsPrice - discount;
        System.out.println("Сумма скидки - " + discount) ;
        System.out.println("Общая стоимость товаров со скидкой - " + discountPrice) ;

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("    J   a  v     v  a   \n" + 
                "    J  a a  v   v  a a\n" + 
                " J  J aaaaa  V V  aaaaa\n" + 
                "  JJ a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println(byteMax + " " + ++byteMax +" " + --byteMax);
        System.out.println(shortMax + " " + ++shortMax +" " + --shortMax);
        System.out.println(intMax + " " + ++intMax +" " + --intMax);
        System.out.println(longMax + " " + ++longMax +" " + --longMax);

        System.out.println("\n5.Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("С использованием третьей переменной" + "\nИсходные значения : " + num1 + " " + num2 );
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Новые значения переменных: " + num1 +" " + num2 +
                "\nС помощью арифметических операций" + "\nИсходные значения : " + num1 + " " + num2 );
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения переменных: " + num1 +" " + num2 +
                "\nС использованием побитовых операций: " + "\nИсходные значения : " + num1 + " " + num2 );
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения переменных: " + num1 +" " + num2);

        System.out.println("\n6.Вывод символов и их кодов");
        char hush = '#';
        char umpersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) hush + " " + hush);
        System.out.println((int) umpersand + " " + umpersand);
        System.out.println((int) at + " " + at);
        System.out.println((int) caret + " " + caret);
        System.out.println((int) underscore + " " + underscore);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore95 = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("    " + slash + backSlash + "   " + " \n" + "   " + slash + "  " + backSlash 
                + "  " + " \n" + "  " + slash + underscore95 + leftBracket + " " + rightBracket + backSlash + " " 
                + " \n " + slash + "      " + backSlash + " \n" + slash + underscore95 + underscore95 
                + underscore95 + underscore95 + slash + backSlash + underscore95 + underscore95 + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит:\n" + hundreds + " сотен\n" + tens + " десятков\n" 
                + ones + " единиц\n" + "Сумма его цифр = " + sum +'\n' + "Произведение = " + multiplication);

        System.out.println("\n9.Вывод времени");
        int sourceSeconds = 86399;
        int hours = sourceSeconds / 3600;
        int minutes = sourceSeconds % 3600 / 60;
        int seconds = sourceSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
 }
}