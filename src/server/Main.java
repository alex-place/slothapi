package server;

import org.apache.log4j.Logger;

public class Main {
	
	public static void main(String[] args) throws Exception {
		ExceptionListener listener = new ExceptionListener();
		Thread.setDefaultUncaughtExceptionHandler(listener);
		Logger LOGGER = Logger.getLogger(Main.class);
		LOGGER.info("Launching Sloth Server");
		SlothServer server = new SlothServer();
		server.init();
	}

}
