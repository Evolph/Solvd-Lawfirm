public class EmptyDepartmentException extends Exception {

    private String desc;

    public EmptyDepartmentException(String desc, String mess) {
        super(mess);
        this.desc = desc;
    }
}
