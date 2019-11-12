package fit.hrkj.interfacetest;

/**
 * 演示对数组的处理方式<br>  
 * 2019年4月24日 下午9:09:04
 * @author 华软科技  
 * @version 1.0 
 */
public class CommandTest {

    /**
     * @param args 程序入口
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ProcessArray pa=new ProcessArray();
        int[] target= {3,-4,6,4};
        //第一次处理数组,具体处理行为取决于PrintCommand
        pa.process(target, new PrintCommand());
        //第二次处理数组,具体处理行为取决于AddCommand
        pa.process(target, new AddCommand());

    }

}