package fit.hrkj.interfacetest;
/**
 * <br>
 * 2019年4月24日 下午9:20:37
 * 
 * @author 华软科技
 * @version 1.0
 */
public class AddCommand implements Command {

    /*
     * 处理数组的行为
     * 
     * @see hrkj.interfacetest.Command#process(int[])
     */
    @Override
    public void process(int[] target) {
        // TODO Auto-generated method stub
        int sum = 0;
        for (int i = 0; i < target.length; i++) {
            sum += target[i];
        }
        System.out.println("数组元素的总和是:" + sum);
    }

}