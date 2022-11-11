public class One {
    public static void main(String[] args){
        Person person = new Person("花花",18,"女");
        person.name = "yukiice";
        person.age = 15;
        person.sex = "man";
        Person person1 = new Person("花花",18,"女");
        person1.name = "嘉然";
        System.out.println(person.name);
        System.out.println(person1.name);

//        Person p1 = new Person();
//        Person p2 = p1;
//        System.out.println(p1 == p2);    // 结果是true

//        Person p1 = new Person();   //这两个变量分别引用的是不同的两个对象
//        Person p2 = new Person();
//        System.out.println(p1 == p2);   //结果是false  如果两个变量存放的是不同对象的引用，那么肯定就是不一样的了


        Person p1 = new Person("花花",18,"女");
        System.out.println(p1.name);
        System.out.println(p1.sex);
        System.out.println(p1.age);   // 不赋值的话  默认都是初始值


        p1.hello();
        System.out.println(p1.add(1,2));

        p1.setNameOne("yukiice");
        System.out.println("没有this的"+p1.name);

        p1.setNameTwo("yukiice");
        System.out.println("没有this的"+p1.name);
    }
}
