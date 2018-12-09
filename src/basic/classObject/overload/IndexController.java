package basic.classObject.overload;

 class Hero1 {
    private String name;
    protected float hp;
         
    public static void battleWin() {
        System.out.println("我是父类的类方法");
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
 class ADHero1 extends Hero1{
    public static void battleWin() {
        System.out.println("我是ADHero的battleWin()的类方法");
    }
}
/**
 * 隐藏
 * @author Chen
 * 与重写类似，方法的重写是子类覆盖父类的对象方法
 * 隐藏，就是子类覆盖父类的类方法
 */
public class IndexController {
    /**
     * Hero h =new ADHero();
     * h.battleWin();           //battleWin是一个类方法
     * h是父类类型的引用
     * 但是指向一个子类对象
     * h.battleWin(); 会调用父类的方法？还是子类的方法？answer:调用了父类的类方法
     * 只有“h2是子类类型的引用，指向一个子类对象”的情况，才会调用子类本身的类方法
     */
    public static void main(String[] args) {
        Hero1 h = new ADHero1();
        ADHero1 h2 = new ADHero1();
        h.battleWin();
        h2.battleWin();
    }
}
/**
 * 静态方法不会被覆盖
 */