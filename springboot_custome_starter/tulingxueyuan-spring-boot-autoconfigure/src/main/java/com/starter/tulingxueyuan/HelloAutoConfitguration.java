package com.starter.tulingxueyuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 *
 * 给web应用自动添加一个首页
 */
@Configuration
@ConditionalOnProperty(value = "tuling.hello.name")
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfitguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    public IndexController indexController(){
        return new IndexController(helloProperties);
    }
}
