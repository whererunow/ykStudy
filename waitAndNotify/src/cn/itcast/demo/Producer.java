package cn.itcast.demo;

public class Producer extends Thread {

    public Goods goods;

    public Producer(Goods goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        while(true){
            synchronized (goods){
                if(goods.flag == true){
                    try {
                        System.out.println("有商品，生产者进入等待");
                        goods.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("没有商品，生产者被唤醒 开始生产商品");
                    try {
                        Thread.sleep(3000);
                        System.out.println("3秒后生产出商品,修改商品状态为有，唤醒消费者线程");
                        goods.flag = true;
                        goods.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
