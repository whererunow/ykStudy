package cn.itcast.demo;

public class Consumer extends Thread {
    public Goods goods;

    public Consumer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            synchronized (goods){
                if(goods.flag == false){
                    try {
                        System.out.println("没有商品，消费者进入等待状态");
                        goods.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    try {
                        System.out.println("有商品了，消费者开始消费,耗时3秒买完商品");
                        Thread.sleep(3000);
                        System.out.println("修改商品状态为无,唤醒生产者线程");
                        goods.flag = false;
                        goods.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
