package springbootstartersamples.flymq;

import com.objcoding.flymq.core.Selector;
import com.objcoding.flymq.utils.HandlerUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chenghui.zhang on 2018/1/31.
 */
@SpringBootApplication
public class FlymqApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlymqApplication.class, args);
        pushMessage();
        run();
    }

    public static void pushMessage() {

        TestMessage testMessage = new TestMessage();
        testMessage.setEvent("这是一个消息事件");

        HandlerUtil.pushMessage(testMessage);

    }

    public static void run() {

        // 2. 重载消息队列
        Class[] eventMessages = {
                TestMessage.class
        };
        HandlerUtil.reloadMessage(eventMessages);

        Selector selector = Selector.newSelector();

        try {

            // 3.加载任务列表
            Class[] task = {
                    TestEventHandler.class
            };
            selector.addTask(task);

            // 4.启动redis-mq
            selector.start(3000L);

        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
