package cn.itcast.singleton;

/**
 * 饿汉式单例模式
 * 线程安全 单例对象只在类加载的时候加载一次
 */
public class Demo01 {

    private static  Demo01 instance = new Demo01();

    private Demo01(){}//构造方法必须私有化

    public static Demo01 getInstance(){
        return instance;
    }
}
