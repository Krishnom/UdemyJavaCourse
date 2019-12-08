package exercise.finalkeyword;

public class Password {
    private int key = 9876543;
    private int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    /**
     * This is made final to prevent overriding by subclasses.
     * Reason being that someone can do like below code
     * <code>
     * public class ExtendedPassword extends Password {
     * private int decryptedPassword;
     * public ExtendedPassword(int password) {
     * super(password);
     * this.decryptedPassword = password;
     * }
     * <p>
     * \@Override public void storePassword() {
     * System.out.println("Saving password as " + this.decryptedPassword);
     * }
     * }
     * </code>
     */
    final void storePassword() {
        System.out.println("Saving password as " + encryptedPassword);
    }

    boolean logMeIn(int password) {
        if (encryptDecrypt(password) == encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Can't let you in buddy.");
            return false;
        }
    }
}
