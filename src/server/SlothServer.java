package server;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.esotericsoftware.kryonet.Server;

public class SlothServer extends Server{

	Logger LOGGER = Logger.getLogger(SlothServer.class);

	public void init() throws IOException {
		start();
		bind(45565, 45566);
	}

}