// Syncronized means the thread safe.
class Counter{
int count=0; 
   public synchronized void increment()
    {
        count++;
    }
}
class Syncronized_function{
    public static void main(String[] args) {
        
  
    Counter c=new Counter();
    Thread th1=new Thread(()->{
        for(int i=0;i<=5;i++)
        {
            c.increment();
            
        }
    });

    Thread th2=new Thread(()->{
        for(int i=0;i<=5;i++)
        {
            c.increment();
        }
    });
     th1.start();
     th2.start();
     System.out.println(c.count);
}
}