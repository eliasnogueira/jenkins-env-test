package jenkins;

import org.apache.log4j.Logger;

public class Exec {

    final static Logger logger = Logger.getLogger(Exec.class);

    public static void main(String[] args) {
        String userEnv = System.getenv("BECK_USERNAME");
        String pwdEnd = System.getenv("BECK_PASSWORD");

        String userProperty = System.getProperty("BECK_USERNAME");
        String pwdProperty = System.getProperty("BECK_PASSWORD");

        logger.info("userEnv = " + userEnv);
        logger.info("pwdEnd = " + pwdEnd);

        logger.info("userProperty = " + userProperty);
        logger.info("userProperty = " + pwdProperty);
    }
}
