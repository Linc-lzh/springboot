package com.starter.tulingxueyuan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
public class IndexController {

    HelloProperties helloProperties;

    public IndexController(HelloProperties helloProperties) {
        this.helloProperties=helloProperties;
    }

    @RequestMapping("/")
    public String index(){
        return helloProperties.getName()+"欢迎您";
    }

}
