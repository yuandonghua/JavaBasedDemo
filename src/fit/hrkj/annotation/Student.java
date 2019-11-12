package fit.hrkj.annotation;

/**
 * 学生通讯录<br>  
 * 2019年6月10日 下午5:21:55
 * @author 华软科技  
 * @version 1.0
 */
public class Student {
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生年龄
     */
    private int age;
    /**
     * 学生性别
     */
    private String gender;
    /**
     * 学生电话
     */
    private String phone;
    /**
     * 学生住址
     */
    private String address;
    /**
     * 学生邮箱
     */
    private String email;

    /**
     * 无参构造器
     */
    public Student() {

    }

    /**
     * 有参构造器
     * @param name 学生姓名
     */
    public Student(String name) {
        this.setName(name);
    }



    /**
     * 获取学生的姓名
     * @return 学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生的名字
     * @param name 学生新名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户的手机号
     * @return 用户手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 给用户设置手机号
     * @param phone 要设置的手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }



    /**
     * 学生会吃
     * @param content 喜欢吃的东西
     */
    public void eat(String content) {
        System.out.println(this.name + "喜欢吃:" + content);
    }

    /**
     * 学生玩的方法
     * @param string 玩的项目
     * @return 玩的结果
     */ 
    private String play(String string) {
        // TODO Auto-generated method stub
        if (string==null) {
            return "不开心";
        }
        return "开心";
    }









}