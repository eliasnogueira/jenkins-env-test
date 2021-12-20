package jenkins;

public class Exec {

    public static void main(String[] args) {
        String userEnv = System.getenv("BECK_USERNAME");
        String pwdEnd = System.getenv("BECK_USERNAME");

        String userProperty = System.getProperty("BECK_USERNAME");
        String pwdProperty = System.getProperty("BECK_USERNAME");

        System.out.println("userEnv = " + userEnv);
        System.out.println("pwdEnd = " + pwdEnd);

        System.out.println("userProperty = " + userProperty);
        System.out.println("userProperty = " + pwdProperty);
    }
}
