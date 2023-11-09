/**
 * Purpose: Demonstrate how to use ExecutorService to execute Runnable tasks
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
  public static void main(String[] args) {
    /**
     * Create runnables
     */
    PrintTask task1 = new PrintTask("task1");
    PrintTask task2 = new PrintTask("task2");
    PrintTask task3 = new PrintTask("task3");

    System.out.println("Starting Executor");

    /**
     * Create ExecutorService to manage threads
     * newCachedThreadPool() creates a thread pool that creates new threads as needed, 
     *  but will reuse previously
     */
    ExecutorService threadExecutor = Executors.newCachedThreadPool();

    /**
     * Start the three PrintTasks
     */
    threadExecutor.execute(task1);
    threadExecutor.execute(task2);
    threadExecutor.execute(task3);

    System.out.println("Tasks started, main ends.\n");

    /**
     * Shut down ExecutorService -- it decides when to shut down threads
     * (when no more tasks are available)
     */
    threadExecutor.shutdown();
  }
}
