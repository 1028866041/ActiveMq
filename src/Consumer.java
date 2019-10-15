import org.apache.activemq.broker.region.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by Administrator on 2019/10/15 0015.
 */
public class Consumer implements MessageListener {

    @Override
    public void onMessage(Message message) {
        TextMessage msg = (TextMessage)message;
        try {
            System.out.println("receive: "+ msg.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
