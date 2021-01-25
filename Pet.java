package cn.kgc.base;

/**
 * ������
 * 
 * @author EDZ
 *
 */
public abstract class Pet {
	//����������
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
		System.out.println("����Pet���е��޲ι��캯��");
	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
		System.out.println("����Pet���еĴ��ι��캯��");
	}
	
	
	/**
	 * �����԰�
	 */
	protected abstract Person print();
	
	/**
	 * �����
	 */
	public abstract void eat();
	
	
	
	
}
