package org.jeecg.runner;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.modules.monitor.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

/**
 * @author MrBird
 * @author FiseTch
 */
@Slf4j
@Component
public class HkdBootStartedUpRunner implements ApplicationRunner {
    @Autowired
    private ConfigurableApplicationContext context;
    @Autowired
    private RedisService redisService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            // 测试 Redis连接是否正常
            redisService.exists("test");
        } catch (Exception e) {
            log.error(" ____   __    _   _ ");
            log.error("| |_   / /\\  | | | |");
            log.error("|_|   /_/--\\ |_| |_|__");
            log.error("                        ");
            log.error("HkdBoot启动失败，{}", e.getMessage());
            log.error("Redis连接异常，请检查Redis连接配置并确保Redis服务已启动");
            // 关闭 FEBS
            context.close();
        }
        if (context.isActive()) {
                Environment env = context.getEnvironment();
                String ip = InetAddress.getLocalHost().getHostAddress();
                String port = env.getProperty("server.port");
                String path = env.getProperty("server.servlet.context-path");
                log.info("\n----------------------------------------------------------\n\t" +
                        "Application HKD-Boot is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                        "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
                        "swagger-ui: \thttp://" + ip + ":" + port + path + "/swagger-ui.html\n\t" +
                        "Doc: \t\thttp://" + ip + ":" + port + path + "/doc.html\n" +
                        "----------------------------------------------------------");

            }
    }
}
