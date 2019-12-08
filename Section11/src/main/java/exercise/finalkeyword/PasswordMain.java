package exercise.finalkeyword;

public class PasswordMain {
    public static void main(String[] args) {
        Password password = new Password(123456);
        password.storePassword();
        password.logMeIn(1);
        password.logMeIn(-1);
        password.logMeIn(0);
        password.logMeIn(123465);
        password.logMeIn(123456);
    }
}
