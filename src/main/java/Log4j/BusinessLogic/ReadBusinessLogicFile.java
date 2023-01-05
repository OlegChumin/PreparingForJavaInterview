package Log4j.BusinessLogic;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadBusinessLogicFile implements BLReader {
    final static Logger logger = Logger.getLogger(ReadBusinessLogicFile.class);

    @Override
    public String reader() {
        String message = "";
        try {
            URL url = ClassLoader.getSystemResource("message.txt").toURI().toURL();
            logger.info("File URL has been gotten");
//            logger.debug();
            byte[] arrayOfBytes = Files.readAllBytes(Paths.get(url.toURI()));
            logger.info("Byte array from file has been gotten");

            message = new String(arrayOfBytes);
            logger.info("Message from file has been gotten");

        } catch (URISyntaxException | NullPointerException | IOException e) {
            logger.error(e);
        }
        return message;
    }
}
