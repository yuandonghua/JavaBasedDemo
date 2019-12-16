package fit.hrkj.polymorphism;

/**
 * 
 * @Name: BaseClass
 * @Description: 父类
 * @author 华软科技
 * @date 2019年4月8日 下午3:48:31
 */
class BaseClass {
    public int book = 6;

    public void base() {
        System.out.println("父类的普通方法");
    }
      void base2() {
        System.out.println("父类独有的普通方法");
    }
    public void test() {
        System.out.println("父类的被覆盖的方法");
    }
    
}


