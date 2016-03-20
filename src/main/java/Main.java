import exception.GoodException;

public class Main {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Main main = new Main();
        try {
            main.raiseException();
            log.warn("ololo");
        } catch (Exception e) {
            log.error("exception", e);
        }
    }

    private void raiseException() {
        throw new GoodException("info message");
    }
}
