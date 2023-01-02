public class InsufficientFundsException extends Exception {
    private String desc;

    public InsufficientFundsException(String desc, String mess) {
        super(mess);
        this.desc = desc;
    }
}
