package server;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

import server.k.*;

public class ServerListener extends Listener {

	@Override
	public void received(Connection connection, Object object) {
		if (object instanceof SomeRequest) {
			SomeRequest request = (SomeRequest) object;
			System.out.println(request.text);

			SomeResponse response = new SomeResponse();
			response.text = "Thanks";
			connection.sendTCP(response);
		}
	}

}
