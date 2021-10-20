package sp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		MessageSupportFactory factory = MessageSupportFactory.newInstance();
		MessageProvider messageProvider = factory.getProvider();
		MessageRenderer messageRenderer = factory.getRenderer();
		
		
		messageRenderer.setMessageProvider(messageProvider);
		messageRenderer.render();

	}

}
