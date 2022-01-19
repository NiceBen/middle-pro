package com.zsl.middlepro.annotation;


import com.zsl.middlepro.config.ConditionalConfig;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ConditionalConfig.class)
public @interface RedisConditional {
    // 在自定义注解上加入 @Conditional(ConditionalConfig.class) 让此类具有同样的功能
    String[] value();   // 定义注解参数，这里我们使用数组
}
