package multiplethread;

import charactor.Hero;

/**
 * 类KillThread 继承Thread，并且重写run方法 做到盖伦在攻击提莫的同时，赏金猎人也在攻击盲僧
 * 
 * @author zhu_dully
 *
 */
public class KillThread extends Thread {
	private Hero h1;
	private Hero h2;

	public KillThread(Hero h1, Hero h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (!h2.isDead()) {
			h1.attackHero(h2);
		}
	}

}
