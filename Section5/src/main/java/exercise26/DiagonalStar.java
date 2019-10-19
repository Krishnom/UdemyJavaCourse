package exercise26;

class DiagonalStar {
    public static void printSquareStar(int number){
        if (number >= 5) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    System.out.print(j == 1 || j == number ||
                            i == 1 || i == number ||
                            j == i || i == number - j + 1 ? "*" : " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}