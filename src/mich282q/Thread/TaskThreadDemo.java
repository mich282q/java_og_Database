package mich282q.Thread;

public class TaskThreadDemo {

    public static void main(String[] args) {
	// write your code here

        //Create Threads
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b',100);
        Runnable print100 = new PrintNum(100);

        //Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        //Start Threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//The task for printing a character a specified number of times
class PrintChar implements Runnable{
    private char charToPrint; //the Character to print
    private int times; // The Number of times to repeat

    /** Construct a task with a specified character and number of
     * Times to print the Character
     */

    public PrintChar (char c, int t) {
        charToPrint = c;
        times = t;
    }
    @Override /** Override the run() method to tell the system
    * what task to perform
 */
    public void run(){
        for(int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}

//the task class for printing numbers from 1 to n for a given n
class PrintNum implements Runnable{
    private int LastNum;
    /** Construct a task for printer 1, 2, ...., n */
    public PrintNum (int n) {
        LastNum = n;
    }
    @Override /** Tell the Thread how to run */
    public void run() {
        for(int i = 1; i <= LastNum; i++) {
            System.out.print(""+ i );
        }
    }
}