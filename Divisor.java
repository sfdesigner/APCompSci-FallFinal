public class Main {

    public static void main(String[] args) {

        int maxValue = 100;
        int maxDivisor = 9;

        for (int i = maxDivisor; i > 1; i--) {

            System.out.println("Numbers evenly divisible by " + i);

            for (int j = 1; j <= maxValue; j++) {

                if (j % i == 0) System.out.print(j + " ");

            }

            System.out.println();
        }

    }
}

/*
Numbers evenly divisible by 9
9 18 27 36 45 54 63 72 81 90 99 
Numbers evenly divisible by 8
8 16 24 32 40 48 56 64 72 80 88 96 
Numbers evenly divisible by 7
7 14 21 28 35 42 49 56 63 70 77 84 91 98 
Numbers evenly divisible by 6
6 12 18 24 30 36 42 48 54 60 66 72 78 84 90 96 
Numbers evenly divisible by 5
5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 
Numbers evenly divisible by 4
4 8 12 16 20 24 28 32 36 40 44 48 52 56 60 64 68 72 76 80 84 88 92 96 100 
Numbers evenly divisible by 3
3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66 69 72 75 78 81 84 87 90 93 96 99 
Numbers evenly divisible by 2
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 
*/
