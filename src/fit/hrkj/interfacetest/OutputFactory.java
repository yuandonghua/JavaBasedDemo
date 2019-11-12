package fit.hrkj.interfacetest;

/**
 * 演示Output工厂来生产Output对象<br>
 * 2019年4月24日 下午8:32:43
 * 
 * @author 华软科技
 * @version 1.0
 */
public class OutputFactory {
    public Output getOutput() {
        return new BetterPrinter();
    }

    /**
     * @param args 程序入口
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OutputFactory of = new OutputFactory();
        for (int i = 0; i <50; i++) {
        	Computer c = new Computer(of.getOutput());
            c.keyIn(i+"");
            c.print();
		}
        

    }

}
