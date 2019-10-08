package challenge.encapsulation;

public class Printer {
    private double tonerLevel = 100.00;
    private boolean isDuplex;
    private int pagesPrinted = 0;
    private double perPageTonerCost;
    private int maxPrintCapacity;

    public Printer(boolean isDuplex, int maxPrintCapacity) {
        this.maxPrintCapacity = maxPrintCapacity;
        this.isDuplex = isDuplex;
        perPageTonerCost = tonerLevel / maxPrintCapacity;
    }

    public void printPage(int pages) {
        int pagesNeeded = pages;

        if (tonerLevel < (double) pages * perPageTonerCost) {
            System.out.println("Replace toner to print pages");
            return;
        }

        if (isDuplex) {
            pagesNeeded = pages / 2 + (pages % 2);
            System.out.println("Printing in duplex mode");
            pagesPrinted += pagesNeeded;
        } else {
            System.out.println("Printing pages in one sided mode");
            pagesPrinted += pages;
        }

        adjustTonerLevel(pages);

        System.out.println("Total pages printed: " + pagesPrinted);
        System.out.println("Toner level: " + tonerLevel);
    }

    private void adjustTonerLevel(int pages) {
        tonerLevel -= perPageTonerCost * pages;
    }

    /**
     * capacity in percentage
     *
     * @param capacity
     */
    public int refillToner(double capacity) {
        if (capacity < 0.0 || capacity > 100) {
            System.out.println("Invalid toner");
            return -1;
        } else if ((capacity + tonerLevel) > 100.0) {
            return -1;
        } else {
            tonerLevel += capacity;
        }
        return (int) tonerLevel;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
