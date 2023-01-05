package Log4j.BusinessLogic;

public class ApplicationBusinessLogic {
    public static void main(String[] args) {
        BLReader blReader = new ReadBusinessLogicFile();
        String str = blReader.reader();
        System.out.println(str);
    }
}
