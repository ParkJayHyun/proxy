package hello.proxy.pureproxy.decorator.code;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecoratorAbstract extends Decorator{

    public MessageDecoratorAbstract(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        log.info("MessageDecoratorAbstract 실행");
        String result = super.operation();
        String decoResult = "*****" + result + "*****";
        log.info("MessageDecoratorAbstract 꾸미기 적용전 = {} , 적용 후 = {}", result, decoResult);
        return decoResult;
    }
}
