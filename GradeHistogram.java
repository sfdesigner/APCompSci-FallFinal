import java.util.Scanner;

public class Main {

    public static Scanner sc;

    public static void main(String[] args) {

        boolean inputLoop = true;

        int a = 0, b = 0, c = 0, d = 0, f = 0;

        System.out.println("Grade Histogram");
        System.out.println("Enter individual grades below");
        System.out.println("When finished, enter -1");

        do {
            sc = new Scanner(System.in);
            double grade = sc.nextDouble();

            if (grade == -1) inputLoop = false;
            if (grade >= 90) a++;
            if (grade >= 80 && grade < 90) b++;
            if (grade >= 70 && grade < 80) c++;
            if (grade >= 60 && grade < 70) d++;
            if (grade >= 0 && grade < 60) f++;

        } while (inputLoop);

        displayChart(a,b,c,d,f);
    }

    public static void displayChart(int a, int b, int c, int d, int f) {

        System.out.println("A: " + buildBar(a));
        System.out.println("B: " + buildBar(b));
        System.out.println("C: " + buildBar(c));
        System.out.println("D: " + buildBar(d));
        System.out.println("F: " + buildBar(f));

    }

    public static String buildBar(int count) {
        String bar = "";

        for (int i = 0; i < count; i++ ) {
            bar += "=";
        }

        return bar;
    }

}
