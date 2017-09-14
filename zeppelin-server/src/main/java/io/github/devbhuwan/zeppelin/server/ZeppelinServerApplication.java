package io.github.devbhuwan.zeppelin.server;

import org.apache.zeppelin.server.ZeppelinServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bhuwan Prasad Upadhyay
 */
@SpringBootApplication
public class ZeppelinServerApplication {

    public static void main(String[] args) throws InterruptedException {
        ZeppelinServer.main(args);
    }

}
