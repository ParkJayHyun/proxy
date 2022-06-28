package hello.proxy.config.v2_dynamicproxy;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamicProxyFilterConfig {

    public static final String[] PATTERNS = {"request*", "order*", "save*"};

}
