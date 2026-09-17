import java.util.Scanner;

public class WarehouseInventoryTracker {

    public static final String[] ZONE_CODES = {"Z1", "Z2", "Z3"};
    public static final String[] ZONE_NAMES = {"North Dock", "South Dock", "Cold Storage"};
    public static final int ZONE_COUNT = 3;

    private static final String[] DEFAULT_PRODUCTS = {
        "Rice", "Oil", "Wheat", "Sugar", "Pulses", "Tea", "Coffee", "Spices", "Milk", "Salt"
    };

    public static int totalStock(int[][] stock, int productIndex) {
        if (stock == null || productIndex < 0 || productIndex >= stock.length) {
            return 0;
       
        }
       
        int total = 0;
        for (int zone = 0; zone < stock[productIndex].length; zone++) {
            total += stock[productIndex][zone];
        }
        return total;
    }

    public static int linearSearch(int[][] stock, int productIndex, int zoneIndex) {
        if (stock == null || productIndex < 0 || productIndex >= stock.length) {
            return -1;
        }
        if (zoneIndex < 0 || zoneIndex >= stock[productIndex].length) {
            return -1;
        }

        for (int r = 0; r < stock.length; r++) {
            if (r == productIndex) {
                for (int c = 0; c < stock[r].length; c++) {
                    if (c == zoneIndex) {
                        return stock[r][c];
                    }
                }
            }
        }
        return -1;
    }

    public static int findProductByName(String[] productNames, String targetName) {
        if (productNames == null || targetName == null) return -1;
        for (int i = 0; i < productNames.length; i++) {
            if (productNames[i] != null && productNames[i].equalsIgnoreCase(targetName.trim())) {
                return i;
            }
        }
        return -1;
    }

    public static int findZoneByCode(String zoneCode) {
        if (zoneCode == null) return -1;
        for (int z = 0; z < ZONE_CODES.length; z++) {
            if (ZONE_CODES[z].equalsIgnoreCase(zoneCode.trim())) {
                return z;
            }
        }
        return -1;
    }

    public static int[] selectionSort(int[] totals) {
        int n = totals.length;
        int[] rankedIndices = new int[n];
        for (int i = 0; i < n; i++) {
            rankedIndices[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (totals[rankedIndices[j]] > totals[rankedIndices[maxIdx]]) {
                    maxIdx = j;
                }
            }
            int temp = rankedIndices[i];
            rankedIndices[i] = rankedIndices[maxIdx];
            rankedIndices[maxIdx] = temp;
        }

        return rankedIndices;
    }

    public static void printStockReport(String[] productNames, int[][] stock, int[] totals, int[] rankedIndices) {
        int[] zoneCounts = new int[ZONE_COUNT];
        int grandTotal = 0;
        for (int z = 0; z < ZONE_COUNT; z++) {
            for (int i = 0; i < stock.length; i++) {
                zoneCounts[z] += stock[i][z];
            }
        }
        for (int t : totals) {
            grandTotal += t;
        }

        System.out.println();
        System.out.printf("%-12s  %16s  %16s  %18s  %12s%n",
                "Product", "Z1 (North Dock)", "Z2 (South Dock)", "Z3 (Cold Storage)", "Total Stock");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < productNames.length; i++) {
            System.out.printf("%-12s  %16d  %16d  %18d  %12d%n",
                    productNames[i], stock[i][0], stock[i][1], stock[i][2], totals[i]);
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-12s  %16d  %16d  %18d  %12d%n",
                "Zone Counts", zoneCounts[0], zoneCounts[1], zoneCounts[2], grandTotal);
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("Ranking by total stock:");
        for (int rank = 0; rank < rankedIndices.length; rank++) {
            int originalIdx = rankedIndices[rank];
            System.out.println((rank + 1) + ". " + productNames[originalIdx] + " (" + totals[originalIdx] + ")");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Warehouse Inventory Tracker =====");

        System.out.print("Enter number of products: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int numProducts = scanner.nextInt();
        if (numProducts <= 0) {
            System.out.println("Number of products must be greater than 0.");
            scanner.close();
            return;
        }

        String[] productNames = new String[numProducts];
        int[][] stock = new int[numProducts][ZONE_COUNT];

        System.out.println();
        System.out.println("--- Enter Stock for Warehouse Zones ---");
        for (int i = 0; i < numProducts; i++) {
            String defaultName = (i < DEFAULT_PRODUCTS.length) ? DEFAULT_PRODUCTS[i] : ("Product" + (i + 1));
            productNames[i] = defaultName;
            System.out.println("\nProduct " + (i + 1) + " (" + defaultName + "):");

            for (int z = 0; z < ZONE_COUNT; z++) {
                System.out.printf("  Enter %s (%s) stock: ", ZONE_CODES[z], ZONE_NAMES[z]);
                stock[i][z] = scanner.nextInt();
            }
        }

        int[] totals = new int[numProducts];
        for (int i = 0; i < numProducts; i++) {
            totals[i] = totalStock(stock, i);
        }

        int[] rankedIndices = selectionSort(totals);

        printStockReport(productNames, stock, totals, rankedIndices);

        scanner.close();
    }

}
