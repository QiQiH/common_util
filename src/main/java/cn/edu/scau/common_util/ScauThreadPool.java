package cn.edu.scau.common_util;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScauThreadPool {


    private static ScauThreadPool mInstance = new ScauThreadPool();

    public static ScauThreadPool getInstance() {
        return mInstance;
    }

    private int corePoolSize;//核心线程池的数量，同时能够执行的线程数量  
    private int maximumPoolSize;//最大线程池数量，表示当缓冲队列满的时候能继续容纳的等待任务的数量  
    private long keepAliveTime = 1;//存活时间  
    private TimeUnit unit = TimeUnit.HOURS;
    private ThreadPoolExecutor executor;

    private ScauThreadPool() {
        /**
         * 给corePoolSize赋值：当前设备可用处理器核心数*2 + 1
         */
        corePoolSize = Runtime.getRuntime().availableProcessors() * 2 + 1;
        maximumPoolSize = corePoolSize;
        executor = new ThreadPoolExecutor(
                corePoolSize,
                maximumPoolSize,
                keepAliveTime,
                unit,
                new LinkedBlockingQueue<Runnable>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
    }

    /**
     * 执行任务
     */
    public void execute(Runnable runnable) {
        execute(runnable, Thread.MIN_PRIORITY);
    }

    public void execute(Runnable runnable, int priority) {
        if (runnable == null) {
            return;
        }

        Thread t = new Thread(runnable);
        t.setPriority(priority);
        executor.execute(t);
    }

    /**
     * 从线程池中移除任务
     */
    public void remove(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        executor.remove(runnable);
    }
}
