public class Main {

    public static int years;

    public static void main(String[] args) {

        populate(500,20,40,30,60);

    }

    public static void populate(int population, double minBirthRate, double maxBirthRate, double minDeathRate, double mmaxDeathRate) {

        years++;

        int born = (int) (Math.random() * (maxBirthRate - minBirthRate) + minBirthRate);
        int died = (int) (Math.random() * (mmaxDeathRate - minDeathRate) + minDeathRate);

        population += born;
        population -= died;

        System.out.println("Year " + years + ": " + born + " born; " + died + " died; " + population + " now alive");

        if (population > 0) {
            populate(population, minBirthRate, maxBirthRate, minDeathRate, mmaxDeathRate);
        }
    }
}

/*
Year 1: 39 born; 53 died; 486 now alive
Year 2: 39 born; 49 died; 476 now alive
Year 3: 22 born; 43 died; 455 now alive
Year 4: 36 born; 58 died; 433 now alive
Year 5: 32 born; 47 died; 418 now alive
Year 6: 39 born; 59 died; 398 now alive
Year 7: 38 born; 53 died; 383 now alive
Year 8: 21 born; 48 died; 356 now alive
Year 9: 31 born; 41 died; 346 now alive
Year 10: 37 born; 38 died; 345 now alive
Year 11: 25 born; 40 died; 330 now alive
Year 12: 32 born; 34 died; 328 now alive
Year 13: 35 born; 37 died; 326 now alive
Year 14: 37 born; 38 died; 325 now alive
Year 15: 39 born; 37 died; 327 now alive
Year 16: 32 born; 40 died; 319 now alive
Year 17: 29 born; 59 died; 289 now alive
Year 18: 31 born; 47 died; 273 now alive
Year 19: 31 born; 49 died; 255 now alive
Year 20: 20 born; 59 died; 216 now alive
Year 21: 25 born; 37 died; 204 now alive
Year 22: 36 born; 59 died; 181 now alive
Year 23: 38 born; 41 died; 178 now alive
Year 24: 33 born; 37 died; 174 now alive
Year 25: 37 born; 45 died; 166 now alive
Year 26: 39 born; 59 died; 146 now alive
Year 27: 38 born; 46 died; 138 now alive
Year 28: 31 born; 38 died; 131 now alive
Year 29: 34 born; 35 died; 130 now alive
Year 30: 21 born; 46 died; 105 now alive
Year 31: 36 born; 50 died; 91 now alive
Year 32: 38 born; 39 died; 90 now alive
Year 33: 35 born; 42 died; 83 now alive
Year 34: 35 born; 36 died; 82 now alive
Year 35: 38 born; 37 died; 83 now alive
Year 36: 31 born; 38 died; 76 now alive
Year 37: 34 born; 52 died; 58 now alive
Year 38: 32 born; 30 died; 60 now alive
Year 39: 20 born; 42 died; 38 now alive
Year 40: 20 born; 38 died; 20 now alive
Year 41: 38 born; 38 died; 20 now alive
Year 42: 33 born; 43 died; 10 now alive
Year 43: 32 born; 48 died; -6 now alive
*/
