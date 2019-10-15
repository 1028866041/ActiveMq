import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by Administrator on 2019/10/15 0015.
 */
public class AppConsumer {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("config/consumer.xml");
        //Consumer consumer = context.getBean(Consumer.class);
    }
}
