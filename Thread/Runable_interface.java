class Hi implements Runnable{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Hi");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Hello implements Runnable{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Runable_interface{
    public static void main(String[] args) {
        Hi h1=new Hi();
        Hello h2=new Hello();

        Thread t1=new Thread(h1);
        Thread t2=new Thread(h2);

        t1.start();
        try{Thread.sleep(10);}
        catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();
    }
}