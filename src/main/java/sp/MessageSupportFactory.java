package sp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
	private static MessageSupportFactory sp;
	private MessageRenderer renderer;
	private MessageProvider provider;

	private MessageSupportFactory() {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream("C:/PrivatBank/Mvn/app24/src/main/resources/application.properties"));
			String rendererClass = p.getProperty("renderer.class");
			String providerClass = p.getProperty("provider.class");
			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static {
		sp = new MessageSupportFactory();
	}

	public static MessageSupportFactory newInstance() {
		return sp;
	}

	public MessageRenderer getRenderer() {
		return renderer;
	}

	public MessageProvider getProvider() {
		return provider;
	}

}
