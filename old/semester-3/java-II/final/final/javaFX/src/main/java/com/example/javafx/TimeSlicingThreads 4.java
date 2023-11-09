/**
 * Purpose: To demonstrate multiple thread functioning
 */

public class TimeSlicingThreads extends Thread {
  public static void main(String[] args) {
    /**
     * @Init three threads
     */
    TimeSlicingThreads threadOne, threadTwo, threadThree;
    threadOne = new TimeSlicingThreads();
    threadTwo = new TimeSlicingThreads();
    threadThree = new TimeSlicingThreads();

    // Start threads
    threadOne.start();
    threadTwo.start();
    threadThree.start();
  }

  @Override
  public void run() {
    int pause;

    for (int i = 0; i < 10; i++) {
      try {
        System.out.println(getName() + " is awake");
        pause = (int) (Math.random() * 3000);
        sleep(pause);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}
