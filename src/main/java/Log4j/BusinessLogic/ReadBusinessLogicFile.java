package Log4j.BusinessLogic;

import org.apache.log4j.Logger;


public class ReadBusinessLogicFile implements BLReader{
    final static Logger logger = Logger.getLogger(ReadBusinessLogicFile.class);
    @Override
    public String reader() {
        String message = "";
        logger.info("File from URL has been gotten");
        return null;
    }
}
