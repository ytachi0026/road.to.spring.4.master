package spring.in.action.ch02.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MagicBeans {

    @Bean
    //@Conditional(MagicExistsCondition.class)
    public MagicBeans magicBean() {
        return new MagicBeans();
    }
}
