package com.zsl.middlepro.config;

import com.zsl.middlepro.annotation.RedisConditional;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ConditionalConfig implements Condition {
    /**
     * @param context  作用: 获取 Bean工厂  ClassLoad  Class 环境变量等
     * @param metadata 作用: 注解元对象
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean flag = false;
        /**
         * annotatedTypeMetadata.getAnnotationAttributes 方法可以获取注解的属性值
         * 参数 为注解的全限定名 这里我们用类的Class属性直接获取
         * 返回的map 结构为 {value=[]} vaule为固定key 我们直接通过value获取属性即可
         */
        Map<String, Object> conditional =
                metadata.getAnnotationAttributes(RedisConditional.class.getName());
        try {
            String[] values = (String[]) conditional.get("value");
            for (String val : values) {
                Class<?> aClass = Class.forName(val);
                System.out.println(aClass + " 加载成功");
            }
            flag = true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
