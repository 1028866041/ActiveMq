import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by Administrator on 2019/10/7 0007.
 */
public class Producer implements Service{

    @Autowired
    JmsTemplate jmsTemplate;
    @Resource(name="queueDestination")
    Destination destination;

    public void sendMessage(String msg) {

        jmsTemplate.send(destination, new MessageCreator(){
            public Message createMessage(Session session) throws JMSException {
                TextMessage msg = session.createTextMessage();
                msg.setText("send");
                System.out.println(msg.getText());
                return msg;
            }
        });
    }
}