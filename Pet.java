package cn.kgc.base;

/**
 * 宠物类
 * 
 * @author EDZ
 *
 */
public abstract class Pet {
	//公共的属性
	protected String name;
	protected int health;
	protected int love;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
			this.health = health;
		}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public Pet() {
		System.out.println("我是Pet类中的无参构造函数");
	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
		System.out.println("我是Pet类中的带参构造函数");
	}
	
	
	/**
	 * 宠物自白
	 */
	protected abstract Person print();
	
	/**
	 * 宠物吃
	 */
	public abstract void eat();
	
	
	
	
}
