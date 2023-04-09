class Priority{
    public static void main(String[] args) {
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
        
        System.out.println(th1.getName());
        th2.setName("Aditya Ghatiya");
        
        System.out.println(th2.getName());
        th1.setPriority(Thread.NORM_PRIORITY);
        
        th1.start();
        System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentState());
        th2.start();
        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());

    }
}