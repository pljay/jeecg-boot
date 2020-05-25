package org.jeecg.config;

import lombok.Data;
import org.jeecg.common.entity.HkdBootConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池配置
 * @author PLJay
 * @date 2020年4月24日
 */
@EnableAsync
@Configuration
@Data
public class ThreadPoolConfig {

    /**
     * 核心数
     */
    @Value("${threadPool.corePoolSize}")
    private int corePoolSize;
    /**
     * 最大线程树 超过最大已入队列当中等待
     */
    @Value("${threadPool.maxPoolSize}")
    private int maxPoolSize;
    /**
     * 队列容量
     */
    @Value("${threadPool.queueCapacity}")
    private int queueCapacity;
    /**
     * 线程活跃时间
     */
    @Value("${threadPool.keepAliveSeconds}")
    private int keepAliveSeconds;
    /**
     * 线程名称前缀
     */
    @Value("${threadPool.threadNamePrefix}")
    private String threadNamePrefix;
    /**
     * 任务完完成后是否关闭线程池
     */
    @Value("${threadPool.waitForTasksToCompleteOnShutdown}")
    private boolean waitForTasksToCompleteOnShutdown;
    /**
     * 队列等待中断时间
     */
    @Value("${threadPool.awaitTerminationSeconds}")
    private int awaitTerminationSeconds;

    @Bean(HkdBootConstant.ASYNC_POOL)
    public ThreadPoolTaskExecutor asyncThreadPoolTaskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //核心数
        executor.setCorePoolSize(corePoolSize);
        // 最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        //队列容量
        executor.setQueueCapacity(queueCapacity);
        //线程活跃时间
        executor.setKeepAliveSeconds(keepAliveSeconds);
        //线程名称
        executor.setThreadNamePrefix(threadNamePrefix);
        //所有任务完完成后关闭线程池
        executor.setWaitForTasksToCompleteOnShutdown(waitForTasksToCompleteOnShutdown);
        //等待中断时间
        executor.setAwaitTerminationSeconds(awaitTerminationSeconds);
        //拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //初始化线程
        executor.initialize();
        return executor;
    }
}
