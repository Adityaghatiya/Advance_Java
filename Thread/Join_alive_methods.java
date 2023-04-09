class Join_alive_methods {
    public static void main(String[] args)throws Exception {
        Thread th1=new Thread(()->{
            for(int i=0;i<=5;i++)
            {
                System.out.println("Hi");
                try{Thread.sleep(1000);}
                catch(Exception e){
                    System.out.println(e);
                }
            }
        });

        Thread th2=new Thread(()->{
            for(int i=0;i<=5;i++)
            {
                System.out.println("Hello");
                try{Thread.sleep(1000);}
                catch(Exception e){
                    System.out.println(e);
                }
            }
        });
        th1.start();
        System.out.println(th1.isAlive());
        th2.start();
        System.out.println(th2.isAlive());
       th1.join();
       th2.join();
        System.out.println("Bye");
    }
}