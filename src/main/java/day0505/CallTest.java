/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:CallTest
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author arika
 * @create 2016-05-05
 */
@SuppressWarnings("unchecked")
public class CallTest {
    public static void main(String[] args) throws ExecutionException,
            InterruptedException {
        System.out.println("程序开始运行......");
        Date date1 = new Date();
        int taskSize = 5;
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        List<Future> list = new ArrayList<Future>();

        for (int i = 0; i < taskSize; i++) {
            Callable c = new MyCallable(i + " ");
            Future f = pool.submit(c);
            list.add(f);
        }
        pool.shutdown();

        for (Future f : list) {
            System.out.println(">>>" + f.get().toString());
        }

        Date date2 = new Date();
        System.out.println("------程序运行结束------");
        System.out.println("程序运行时间【" + (date2.getTime() - date1.getTime()) +
                "毫秒】");

    }

    private static class MyCallable implements Callable<Object> {
        private String taskNum;

        public MyCallable(String taskNum) {
                this.taskNum = taskNum;
        }

        public Object call() throws Exception {
            System.out.println(">>>" + taskNum + "任务启动");
            Date dateTmp1 = new Date();
            Thread.sleep(1000);
            Date dateTmp2 = new Date();
            long time = dateTmp2.getTime() - dateTmp1.getTime();
            System.out.println(">>>" + taskNum + "任务终止");
            return taskNum + "任务返回运行结果， 当前任务时间【" + time + "毫秒】";
        }
    }
}
