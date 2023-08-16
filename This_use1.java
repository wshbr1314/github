public class This_use1 {
        String name;
        int age;
        This_use1(String name, int age) {
            //this表示创建的对象，所以可以给实例变量赋值
            this.name = name;
            this.age = age;
        }

        void out() {
            //this.name也就是这里的name，就是实例变量
            System.out.println(name+" " + age);
        }

        public static void main(String[] args) {
            This_use1 s1 = new This_use1("LAO", 18);
            This_use1 s2 = new This_use1("KING", 16);
            s1.out();
            s2.out();
        }
}

