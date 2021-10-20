package sp;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider;

	
	
	@Override
	public void render() {
		JFrame f = new JFrame();
		JLabel l = new JLabel(messageProvider.getMessage());
		f.add(l);
		f.setVisible(true);
		f.setSize(100,100);
		
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
