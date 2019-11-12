package fit.hrkj.interfacetest;


/**
 * 演示使用接口<br>
 * 2019年4月24日 上午9:44:09
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Printer implements Output, Product {

    /**
     * @param args 程序入口
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Output o = new Printer();
        o.getData("java基础");
        o.getData("H5基础");
        o.out();

        o.getData("Android基础");
        o.getData("java企业级");
        o.out();

        // 调用Output接口中定义的默认方法
        o.print("唐僧", "孙悟空", "猪八戒", "沙悟净", "白龙马");
        o.test();

        // 创建一个Printer对象,当成Product使用
        Product p = new Printer();
        System.out.println(p.getProduceTime());

        // 所有类型的引用变量都可直接赋给Object类型的变量
        Object object = p;

    }

    private String[] printData = new String[MAX_CACHE_LINE];

    // 用以记录当前需要打印的作业数
    private int dataNum = 0;

    /*
     * 打印数据
     * 
     * @see hrkj.interfacetest.Output#out()
     */
    @Override
    public void out() {
        // TODO Auto-generated method stub
        // 只要还有作业,就继续打印
        while (dataNum > 0) {
            System.out.println("打印机打印:" + printData[0]);
            // 把作业队列整体前移一位,并将剩下的作业数减1
            System.arraycopy(printData, 1, printData, 0, --dataNum);

        }
    }

    /*
     * 添加打印数据
     * 
     * @see hrkj.interfacetest.Output#getData(java.lang.String)
     */
    @Override
    public void getData(String msg) {
        // TODO Auto-generated method stub
        if (dataNum >= MAX_CACHE_LINE) {
            System.out.println("输出队列已满,添加失败");
        } else {
            // 把打印数据添加到队列里,已保存数据的数量加1
            printData[dataNum++] = msg;
        }
    }

    /*
     * 生产时间
     * 
     * @see hrkj.interfacetest.Product#getProduceTime()
     */
    @Override
    public int getProduceTime() {
        // TODO Auto-generated method stub
        return 50;
    }

}

//定义一个Product接口
interface Product {
    /**
     * 生产时间
     * 
     * @return
     */
    int getProduceTime();
}