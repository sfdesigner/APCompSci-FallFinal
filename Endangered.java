public class Main {

    public static int years;

    public static void main(String[] args) {

        populate(500,.2,.4,.3,.6);

    }

    public static void populate(int population, double minBirthRate, double maxBirthRate, double minDeathRate, double mmaxDeathRate) {

        years++;

        int born = (int) ((Math.random() * (maxBirthRate - minBirthRate) + minBirthRate) * population);
        int died = (int) ((Math.random() * (mmaxDeathRate - minDeathRate) + minDeathRate) * population);

        population += born;
        population -= died;

        System.out.println("Year " + years + ": " + born + " born; " + died + " died; " + population + " now alive");

        if (population > 1) {
            populate(population, minBirthRate, maxBirthRate, minDeathRate, mmaxDeathRate);
        }
    }
}

/*
Year 1: 143 born; 290 died; 353 now alive
Year 2: 127 born; 145 died; 335 now alive
Year 3: 127 born; 101 died; 361 now alive
Year 4: 131 born; 169 died; 323 now alive
Year 5: 95 born; 162 died; 256 now alive
Year 6: 65 born; 109 died; 212 now alive
Year 7: 70 born; 124 died; 158 now alive
Year 8: 32 born; 73 died; 117 now alive
Year 9: 23 born; 40 died; 100 now alive
Year 10: 28 born; 56 died; 72 now alive
Year 11: 23 born; 38 died; 57 now alive
Year 12: 11 born; 27 died; 41 now alive
Year 13: 11 born; 24 died; 28 now alive
Year 14: 10 born; 15 died; 23 now alive
Year 15: 8 born; 10 died; 21 now alive
Year 16: 4 born; 11 died; 14 now alive
Year 17: 4 born; 7 died; 11 now alive
Year 18: 2 born; 4 died; 9 now alive
Year 19: 3 born; 3 died; 9 now alive
Year 20: 2 born; 5 died; 6 now alive
Year 21: 2 born; 1 died; 7 now alive
Year 22: 1 born; 2 died; 6 now alive
Year 23: 2 born; 3 died; 5 now alive
Year 24: 1 born; 2 died; 4 now alive
Year 25: 1 born; 2 died; 3 now alive
Year 26: 1 born; 1 died; 3 now alive
Year 27: 1 born; 1 died; 3 now alive
Year 28: 1 born; 1 died; 3 now alive
Year 29: 0 born; 1 died; 2 now alive
Year 30: 0 born; 1 died; 1 now alive
*/
