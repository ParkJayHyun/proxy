package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecoratorAbstract extends Decorator{

    public TimeDecoratorAbstract(Component component) {
        super(component);
    }

    @Override
    public String operation() {
        log.info("TimeDecoratorAbstract 실행");
        long startTime = System.currentTimeMillis();

        String result = super.operation();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;

        log.info("TimeDecoratorAbstract 종료 resultTime = {}ms", resultTime);
        return result;
    }
}
