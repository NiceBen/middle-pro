package com.zsl.middlepro.config;

import com.zsl.middlepro.annotation.RedisConditional;
import com.zsl.middlepro.domain.RedisTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfigurationTest {

    @Bean
//    @Conditional(ConditionalConfig.class) // 由官方原始注解，替换成自定义的注解
    @RedisConditional({"redis.clients.jedis.Jedis","redis.clients.jedis.BinaryClient"})
    public RedisTest redisTest() {
        return new RedisTest();
    }
}
