package SingletonPattern;

public class Singleton {
    private volatile static Singleton uniqueSingleton;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        if(uniqueSingleton == null){
            synchronized (Singleton.class){
                if(uniqueSingleton == null){
                    uniqueSingleton = new Singleton();
                }
            }
        }
        return uniqueSingleton;
    }

    public void display(){
        System.out.println("你好啊， 树哥");
    }
}
