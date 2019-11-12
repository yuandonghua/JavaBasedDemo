package fit.hrkj.interfacetest;

/**
 * 负责对数组的处理行为<br>
 * 2019年4月24日 下午9:05:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        cmd.process(target);
    }
}