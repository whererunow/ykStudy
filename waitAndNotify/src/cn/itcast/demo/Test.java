package cn.itcast.demo;

public class Test {

    public static void main(String[] args) throws Exception{
        Goods goods = new Goods();
        Consumer consumer = new Consumer(goods);
        Producer producer = new Producer(goods);
        consumer.start();
        producer.start();
    }
}
