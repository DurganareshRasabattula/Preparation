package concurrency.chapter8;

import concurrency.annotation.Sucks;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



/**
 * 8-1 在单线程Executor中任务发生死锁
 */
@Sucks
public class ThreadDeadLock {

    private ExecutorService exec = Executors.newSingleThreadExecutor();

    class RenderPageTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            Future<String> header, footer;
            header = exec.submit(new LoadFileTask("header.html"));
            footer = exec.submit(new LoadFileTask("footer.html"));
            String page = renderBody();
            return header.get() + page + footer.get();
        }

        private String renderBody() {
            return null;
        }

    }

    class LoadFileTask implements Callable<String> {

        private final String file;

        public LoadFileTask(String file) {
            this.file = file;
        }

        @Override
        public String call() throws Exception {
            return file;
        }

    }
}
