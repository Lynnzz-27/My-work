package Math;

public class SecondClass {

    public void hitungAbsolut(int i1, int i2, double d1, double d2) {
        System.out.println("--- Hasil Math.abs ---");
        System.out.println("Absolute value of i1: " + Math.abs(i1));
        System.out.println("Absolute value of i2: " + Math.abs(i2));
        System.out.println("Absolute value of d1: " + Math.abs(d1));
        System.out.println("Absolute value of d2: " + Math.abs(d2));
    }

    public void hitungRound(double d1, double d2) {
        System.out.println("--- Hasil Math.round ---");
        System.out.println("Round off for d1: " + Math.round(d1));
        System.out.println("Round off for d2: " + Math.round(d2));
    }

    public void hitungCeilFloor(double d1, double d2) {
        System.out.println("--- Hasil Ceil & Floor ---");
        System.out.println("Ceiling of '" + d1 + "' = " + Math.ceil(d1));
        System.out.println("Floor of '" + d1 + "' = " + Math.floor(d1));
        System.out.println("Ceiling of '" + d2 + "' = " + Math.ceil(d2));
        System.out.println("Floor of '" + d2 + "' = " + Math.floor(d2));
    }

    public void hitungMinMax(int i1, int i2, double d1, double d2) {
        System.out.println("--- Hasil Min & Max ---");
        System.out.println("Min integer: " + Math.min(i1, i2));
        System.out.println("Max integer: " + Math.max(i1, i2));
        System.out.println("Min double: " + Math.min(d1, d2));
        System.out.println("Max double: " + Math.max(d1, d2));
    }

    public void hitungEksponensial(double val, double base, double pow, double sqrtVal) {
        System.out.println("--- Hasil Eksponensial & Logaritma ---");
        System.out.println("exp(" + val + ") = " + Math.exp(val));
        System.out.println("log(" + val + ") = " + Math.log(val));
        System.out.println("pow(" + base + ", " + pow + ") = " + Math.pow(base, pow));
        System.out.println("sqrt(" + sqrtVal + ") = " + Math.sqrt(sqrtVal));
    }

    public void hitungTrigonometri(double degree, double x, double y) {
        System.out.println("--- Hasil Trigonometri ---");
        double radian = Math.toRadians(degree);
        System.out.println("sin(" + degree + ") = " + Math.sin(radian));
        System.out.println("cos(" + degree + ") = " + Math.cos(radian));
        System.out.println("tan(" + degree + ") = " + Math.tan(radian));
        System.out.println("atan2(" + x + "," + y + ") = " + Math.atan2(x, y));
    }
}