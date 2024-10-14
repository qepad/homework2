public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // task 1

        System.out.println("задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("переменная dog - " + dog);
        System.out.println("переменная cat - " + cat);
        System.out.println("переменная paper - " + paper);

        // task 2

        System.out.println("задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("новое значение dog - " + dog);
        System.out.println("новое значение cat - " + cat);
        System.out.println("новое значение paper - " + paper);

        // task 3

        System.out.println("задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("новое значение dog - " + dog);
        System.out.println("новое значение cat - " + cat);
        System.out.println("новое значение paper - " + paper);

        // task 4

        System.out.println("задание 4");
        var friend = 19;
        System.out.println("значение friend 1 - " + friend);
        friend = friend + 2;
        System.out.println("значение friend 2 - " + friend);
        friend = friend / 7;
        System.out.println("значение friend 3 - " + friend);

        //task 5

        System.out.println("задание 5");
        var frog = 3.5;
        System.out.println("значение frog 1 - " + frog);
        frog = frog * 10;
        System.out.println("значение frog 2 - " + frog);
        frog = frog / 3.5;
        System.out.println("значение frog 3 - " + frog);

        // task 6

        System.out.println("задание 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2 + " - общая масса двух бойцов");
        System.out.println(boxer2 - boxer1 + " - разница в массе двух бойцов");

        // task 7

        System.out.println("задание 7");
        var boxDiff = boxer2 % boxer1;
        System.out.println(boxDiff + " - остаток от деления между двумя весами");

        // task 8

        System.out.println("задание 8");
        var hours = 640;
        var hoursPersonal = 8;
        var workers = hours / hoursPersonal;
        System.out.println("всего работников в компании - " + workers + " человек");
        var workersNew = workers + 94;
        var hoursPersonalNew = hours / workersNew;
        System.out.println("если в компании работает " + workersNew + " человека, то всего " + hoursPersonalNew + " часов работы может быть поделено между сотрудниками");
    }
}