class counter{
    int count=0;
    public synchronized void increment()
    {
        count++;
    }
}
class Syncronization{
    public static void main(String[] args) {
        counter c=new counter();
        Thread th1=new Thread(()->{
            for(int i=0;i<=100;i++)
            {
               c.increment();
            }
           
        });

        // Thread th2=new Thread(()->{
            // for(int i=0;i<=5;i++)
            // {
            //     c.increment();
            // }
        // });
        th1.start();
        // th2.start();
        System.out.println(c.count);

    }
}