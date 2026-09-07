package FoodDeliveryRating;

public class foodDelivery_RatingAnalyzer {

    // method to calculate total
    public static int calcTotal(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // overloaded method for total using 2d array
    public static int calcTotal(int[][] arr, int row) {
        int sum = 0;
        for (int j = 0; j < arr[row].length; j++) {
            sum += arr[row][j];
        }
        return sum;
    }

    // calculate average
    public static double calcAvg(int sum, int count) {
        return (double) sum / count;
    }

    // overloaded average
    public static double calcAvg(int[] arr) {
        int total = calcTotal(arr);
        return (double) total / arr.length;
    }

    public static void main(String[] args) {

        String[] partners = { "Zomato", "Swiggy", "UberEats", "FoodPanda", "Dunzo" };
        String[] params = { "Delivery Speed", "Food Quality", "Packaging", "Service" };

        // 2d array for ratings
        int[][] ratings = {
                { 4, 5, 3, 4 },
                { 3, 4, 4, 3 },
                { 5, 4, 4, 5 },
                { 2, 3, 2, 2 },
                { 4, 4, 3, 5 }
        };

        // 1d array to store total ratings
        int[] totals = new int[5];

        // get totals using the overloaded method
        for (int i = 0; i < 5; i++) {
            totals[i] = calcTotal(ratings, i);
        }

        System.out.println("Ratings for partners:");
        for (int i = 0; i < 5; i++) {
            double average = calcAvg(totals[i], 4);
            System.out.println(partners[i] + " - Total: " + totals[i] + ", Average: " + average);
        }

        // linear search
        int searchVal = 5; // You can change this to search for other ratings
        System.out.println("\nSearching for rating: " + searchVal);

        boolean found = false;
        for (int i = 0; i < ratings.length; i++) {
            for (int j = 0; j < ratings[i].length; j++) {
                if (ratings[i][j] == searchVal) {
                    System.out.println(partners[i] + " got " + searchVal + " for " + params[j]);
                    found = true;
                }
            }
        }

        if (found == false) {
            System.out.println("Rating not found.");
        }

        // bubble sort to rank from highest to lowest
        for (int i = 0; i < totals.length - 1; i++) {
            for (int j = 0; j < totals.length - i - 1; j++) {
                if (totals[j] < totals[j + 1]) {
                    // swap total
                    int t = totals[j];
                    totals[j] = totals[j + 1];
                    totals[j + 1] = t;

                    // swap name
                    String tempName = partners[j];
                    partners[j] = partners[j + 1];
                    partners[j + 1] = tempName;
                }
            }
        }

        System.out.println("\nRankings:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + partners[i] + " (Total: " + totals[i] + ")");
        }

        System.out.println("\nHighest-rated delivery partner is: " + partners[0]);
    }
}