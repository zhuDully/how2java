package basic.classObject;

public class Hero {
	//成员变量
	public String name;//
	public float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	
	 //有参的构造方法
    //默认的无参的构造方法就失效了
    public Hero(String heroname){ 
        name = heroname;
    }
	
	public Hero() {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		new Hero();//创建一个对象，但目前该对象并没引用
		
		Hero h = new Hero();//使用一个引用来指引这个对象
	}
	
}
