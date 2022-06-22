package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.Message;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator() {
        Component realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }

    @Test
    void decorator1() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);
        client.execute();
    }

    @Test
    void decorator2() {
        Component component = new RealComponent();
        Component messageDecorator = new MessageDecorator(component);
        Component timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);
        client.execute();
    }

    /**
     * 공통부분 abstract로 분리 - 메시지
     */
    @Test
    void decorator3() {
        Component realComponent = new RealComponent();
        Component messageDecoratorAbstract = new MessageDecoratorAbstract(realComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecoratorAbstract);
        client.execute();
    }

    /**
     * 공통부분 abstract로 분리 - 시간 측정
     */
    @Test
    void decorator4() {
        Component realComponent = new RealComponent();
        Component messageDecoratorAbstract = new MessageDecoratorAbstract(realComponent);
        Component timeDecoratorAbstract = new TimeDecoratorAbstract(messageDecoratorAbstract);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecoratorAbstract);
        client.execute();
    }
}
