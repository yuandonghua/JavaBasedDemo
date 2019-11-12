package fit.hrkj.interfacetest;

public class PrintCommand implements Command {

    /*
     * 处理数组的行为
     * 
     * @see hrkj.interfacetest.Command#process(int[])
     */
    @Override
    public void process(int[] target) {
        // TODO Auto-generated method stub
        for (int i = 0; i < target.length; i++) {
            System.out.println("打印数组元素:" + target[i]);
        }
    }

}