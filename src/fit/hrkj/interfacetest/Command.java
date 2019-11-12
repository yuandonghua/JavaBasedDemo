package fit.hrkj.interfacetest;

/**
 * 演示接口封装"处理行为"<br>
 * 2019年4月24日 下午9:00:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public interface Command {
    // 接口里定义的process方法用于封装"处理行为"
    void process(int[] target);
}