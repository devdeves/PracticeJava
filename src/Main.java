




class Main{

    public static void main(String[] arg){
        Runnable obj1 = ()->{
            Singleton lazySingleton = Singleton.getInstance();
            System.out.println("hhhhh :"+ lazySingleton);
        };
        Runnable obj2 = ()->{
            Singleton lazySingleton1 = Singleton.getInstance();
            System.out.println("tttt : "+ lazySingleton1);
        };
         Thread t1 = new Thread(obj1);
         Thread t2 = new Thread(obj2);

         t1.start();
         t2.start();
    }


 }
