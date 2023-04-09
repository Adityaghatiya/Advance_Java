class Lamda{
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
        th1.start();
        th2.start();
    }
}