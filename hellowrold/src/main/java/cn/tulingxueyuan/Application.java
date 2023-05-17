package cn.tulingxueyuan;

import cn.tulingxueyuan.controllers.HelloController;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

import static java.nio.charset.StandardCharsets.UTF_8;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你.
 *
 * @SpringBootApplication
 * SpringBoot的启动类（入口）
 * @Configuration spring.xml 也是配置类
 * @ComponentScan = <context:component-scan basePackages="cn.tulingxueyuan"></context:component-scan>
 *
 * Spring底层在解析配置类， 回去解析@ComponentScan,读取basePackages，
 *      如果没有读取到，会将当前配置类所在的包当做扫描包
 *
 * 位置： 最好放在需要扫描包的根目录、或者说放在所有Bean的顶层目录中
 *
 */
@SpringBootApplication // 标记成Springboot的启动类
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringApplication.class,args);
    }

  /*  @Bean
    public HelloController helloController(){
        return new HelloController();
    }*/
}
