package fit.hrkj.interfacetest;

/**
 * 更好的打印设备<br>
 * 2019年4月24日 下午8:41:32
 * 
 * @author 华软科技
 * @version 1.0
 */
public class BetterPrinter implements Output {
    private String[] printData = new String[MAX_CACHE_LINE * 2];
    // 用以记录当前需要打印的作业数
    private int dataNum = 0;

    /*
     * (non-Javadoc)
     * 
     * @see hrkj.interfacetest.Output#out()
     */
    @Override
    public void out() {
        // TODO Auto-generated method stub
        while (dataNum > 0) {
            System.out.println("高速打印机正在打印:" + printData[0]);
            // 把作业队列整体前移一位,并将剩下的作业数减1
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see hrkj.interfacetest.Output#getData(java.lang.String)
     */
    @Override
    public void getData(String msg) {
        // TODO Auto-generated method stub
        if (dataNum >= MAX_CACHE_LINE * 2) {
            System.out.println("输出队列已满,添加失败");
        } else {
            // 把打印数据添加到队列里,已保存数据的数量加1
            printData[dataNum++] = msg;
        }
    }

}