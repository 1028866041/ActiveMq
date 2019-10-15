import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by Administrator on 2019/10/7 0007.
 */
public class App {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("config/producer.xml");
        Producer producer = context.getBean(Producer.class);
        for(int i=0;i<100; i++){
            producer.sendMessage("activemq" + i);
        }
    }
}
