package exercise2;

class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int extraKiloBytes = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println( kiloBytes + " KB = " + megaBytes + " MB and " + extraKiloBytes + " KB");
        }
    }
}
