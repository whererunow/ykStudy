package cn.itcast.singleton;

/**
 * 懒汉式单例模式
 */
public class Demo02 {

    private static Demo02 instance;

    private Demo02(){}

    /**
     * 获取单例对象的方法需要加上synchronized关键字来保证线程安全
     * @return
     */
    public static synchronized Demo02 getInstance() {
        if(instance == null){
            instance = new Demo02();
        }
        return instance;
    }
}
