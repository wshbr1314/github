public class Outer{
    private int num_class=10;
    public void run()
    {
        System.out.println("这是一个外部类方法");
    }
    //这是一个内部类
    public class Inter{
        public void run2()
        {
            System.out.println("这是一个内部类方法");
        }
        public void get_num(){
            //作用：获得外部类私有属性
            System.out.println(num_class);
        }
    }
}
class Use_inter{
    public static void main(String[] args) {
        Outer outer =new Outer();
        //利用外部类对象实例化内部类对象
        Outer.Inter inter=outer.new Inter();
        //内部类调用自己的方法
        inter.run2();
        inter.get_num();
    }
}