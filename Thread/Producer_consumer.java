class Q{
    int num;
    boolean valueset=false;

    public synchronized void put(int num)
    {
        while(valueset)
        {
            try{wait();}
            catch(Exception e){};
        }
        System.out.println("Put="+num);
        this.num=num;
        valueset=true;
        notify();
      }
    public synchronized void get()
    {
        while(!valueset)
        {
            try{wait();}
            catch(Exception e){};
        }
        System.out.println("Get="+num);
        valueset=false;
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    public Producer(Q q)
    {
        this.q=q;
        Thread th1=new Thread(this,"Producer");
        th1.start();
    }
    public void run()
    {
       int i=0;
        
       while(true)
       {
        q.put(i++);
        try{Thread.sleep(1000);}
        catch(Exception e){
           System.out.println(e);
        }
       }
    }
}
class Consumer implements Runnable{
    Q q;
    public Consumer(Q q)
    {
        this.q=q;
        Thread th2 =new Thread(this,"Consumer");
        th2.start();
    }
    public void run()
    {
       
        
       while(true)
       {
        q.get();
        try{Thread.sleep(1000);}
        catch(Exception e){
           System.out.println(e);
        }
       }
    }
}
class Producer_consumer{
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
    }
}
