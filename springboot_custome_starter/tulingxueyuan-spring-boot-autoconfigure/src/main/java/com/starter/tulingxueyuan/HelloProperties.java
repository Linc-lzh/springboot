package com.starter.tulingxueyuan;

import org.springframework.boot.context.properties.ConfigurationProperties;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@ConfigurationProperties("tuling.hello")
public class HelloProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
