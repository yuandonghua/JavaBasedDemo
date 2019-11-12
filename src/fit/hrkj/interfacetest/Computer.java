package fit.hrkj.interfacetest;

/**
 * 演示Computer组合一个打印功能<br>
 * 2019年4月24日 下午8:19:01
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Computer {
    private Output output;

    public Computer(Output output) {
        this.output = output;
    }

    // 定义一个模拟获取字符串输入的方法
    public void keyIn(String msg) {
        output.getData(msg);
    }

    // 定义一个模拟打印的方法
    public void print() {
        output.out();
    }

}