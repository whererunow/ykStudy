package cn.itcast.singleton;

/**
 * 静态内部类来改进懒汉式单例模式
 */
public class Demo03 {
    //私有化构造方法
    private Demo03(){
        System.out.println("Demo03私有化构造方法被执行了");
    }
    //使用静态内部类来维护单例  静态内部类和非静态内部类一样，都是在被调用时才会被加载
    private static class Demo03Factory{
        private static Demo03 instance = new Demo03();
    }
    //提供获取实例的方法
    private static Demo03 getInstance(){
        return Demo03Factory.instance;
    }

    public static void main(String[] args) {
        Demo03 in1 = Demo03.getInstance();
        Demo03 in2 = Demo03.getInstance();
        System.out.println(in1 == in2);
    }
}
