package neeraj;

import java.util.*;

import static java.lang.Math.round;

public class OPERATOR {

        // Complete the solve function below.
        static int solve(double meal_cost, int tip_percent, int tax_percent) {
            meal_cost=meal_cost;
            tip_percent= (int) ((tip_percent/100)*meal_cost);
            tax_percent = (int) ((tax_percent/100)*meal_cost);
           int total = (int) round((meal_cost+tip_percent+tax_percent));
           return total;



        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            double meal_cost = scanner.nextDouble();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int tip_percent = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int tax_percent = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            solve(meal_cost, tip_percent, tax_percent);

            scanner.close();
        }
    }

