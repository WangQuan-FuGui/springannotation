package com.dream.aware;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * 实现Aware的接口的方法都会被spring调用
 *      每一个xxxxAware都是用XXXprocessor实现的
 * EmbeddedValueResolverAware等等...
 */
public class MyHelloAware implements EmbeddedValueResolverAware {

    /**
     *
     * @param stringValueResolver 解析${},#{}
     */
    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        System.out.println(stringValueResolver.resolveStringValue("你好:${os.name}"));
    }
}
