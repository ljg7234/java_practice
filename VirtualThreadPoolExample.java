package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VirtualThreadPoolExample {
    public static void main(String[] args) throws Exception{
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    long sum = 0;
                    for(int i = 1; i <= 1000; i++){
                        sum += i;
                    }
                    Thread.sleep(10);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        int taskNum = 10000;

        ExecutorService threadExecutor = Executors.newFixedThreadPool(100);
        work(taskNum,task,threadExecutor);
        ExecutorService virtualThreadExecutor = Executors.newVirtualThreadPerTaskExecutor();
        work(taskNum,task,virtualThreadExecutor);
    }

    private static void work(int taskNum,Runnable task, ExecutorService executorService) throws Exception{
        long start = System.nanoTime();
        try (executorService){
            for(int count = 0; count < taskNum; count++){
                executorService.execute(task);
            }
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);

        long end = System.nanoTime();
        long workTime = end - start;
        System.out.println("작업 처리 시간: " + workTime);
    }

}
