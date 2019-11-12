package fit.hrkj.annotation;

/**
 * 通讯录测试类<br>  
 * 2019年6月10日 下午5:24:26
 * @author 华软科技  
 * @version 1.0 
 */
public class StudentTest {

	 /**
     * 程序入口
     * @param args 入口参数
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 通过无参构造器创建实例对象
        Student s1 = new Student();
        s1.setName("华软科技");

        System.out.println("学生的名字:" + s1.getName());
        // 初始化学生信息
        Student s2 = new Student("小明1");
        Student s3 = new Student("小明2");
        Student s4 = new Student("小明");
        Student s5 = new Student("小明4");
        Student s6 = new Student("小明5");
        Student s7 = new Student("小明6");
        Student s8 = new Student("小明7");
        Student s9 = new Student("小明8");
        Student s10 = new Student("小明9");
        // 保存为通讯录
        Student[] stus = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10 };
        // 要找的学生
        String name = "小明3";
        // 是否找到小明3
        boolean found = false;
        // 循环通讯录
        for (Student student : stus) {
            // 判断是否要找的学生
            if (name == student.getName()) {
                found = true;
                System.out.println("找到了小明3");
            }
        }

        if (!found) {
            System.out.println("没有找到小明3");
        }

    }
}
