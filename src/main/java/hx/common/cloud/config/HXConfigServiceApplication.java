package hx.common.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author mingliang
 * @Date 2018-06-28 17:57
 */
@SpringBootApplication
@EnableConfigServer
public class HXConfigServiceApplication {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(HXConfigServiceApplication.class,args);
        System.out.println("启动成功，耗时："+(System.currentTimeMillis() - start)+"ms");
    }
}
