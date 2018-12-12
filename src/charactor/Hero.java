package charactor;

public class Hero implements Comparable<Hero> {
	public String name;
	public float hp;

	public int damage;

	public Hero() {

	}

	public Hero(String name) {
		this.name = name;

	}

	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}

	@Override
	public int compareTo(Hero anotherHero) {
		if (damage < anotherHero.damage)
			return 1;
		else
			return -1;
	}

	public boolean matched() {
		return this.hp > 100 && this.damage < 50;
	}

	public int compareHero(Hero h1, Hero h2) {
		return (int) (h1.hp - h2.hp);
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
	}

	public boolean isDead() {
		// TODO 自动生成的方法存根
		return 0 >= hp ? true : false;
	}

	public void attackHero(Hero h) {
		try {
			// 为了表示攻击需要时间，每次攻击暂停1000毫秒
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);

		if (h.isDead())
			System.out.println(h.name + "死了！");
	}

}