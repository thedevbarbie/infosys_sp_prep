package Basics;

public class fraction {
    // Method to add two fractions
    public static Fraction add(Fraction f1, Fraction f2) {
        int numerator = f1.num * f2.den + f1.den * f2.num; // Calculate numerator
        int denominator = f1.den * f2.den; // Calculate denominator
        return new Fraction(numerator, denominator); // Create new Fraction object
    }

    // Method to calculate GCD using the Euclidean Algorithm
    public static int gcd(int num, int den) {
        while (den != 0) {
            int temp = den;
            den = num % den;
            num = temp;
        }
        return num;
    }

    // Inner Fraction class
    public static class Fraction {
        int num; // Numerator
        int den; // Denominator

        // Constructor for Fraction
        public Fraction(int num, int den) {
            if (den == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero.");
            }
            this.num = num;
            this.den = den;
            simplify(); // Simplify fraction upon creation
        }

        // Method to simplify the fraction
        public void simplify() {
            int hcf = gcd(num, den); // Calculate GCD
            num = num / hcf;
            den = den / hcf;
        }
    }

    // Main method
    public static void main(String[] args) {
        Fraction f1 = new Fraction(35, 21); // Create first fraction
        System.out.println(f1.num + "/" + f1.den); // Print first fraction

        Fraction f2 = new Fraction(7, 3); // Create second fraction
        System.out.println(f2.num + "/" + f2.den); // Print second fraction

        Fraction f3 = add(f1, f2); // Add two fractions
        System.out.println(f3.num + "/" + f3.den); // Print resulting fraction
    }
}
