package ck.tyut.first.enums;

interface Behaviour {
	void print();

	String getInfo();
}

public enum Color implements Behaviour {
	RED("红色", 1){
		public long todo(long i){
			return i+1;
		}
	}, GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);
	// 成员变量
	private String name;
	private int index;

	// 构造方法
	Color(String name, int index) {
		this.name = name;
		this.index = index;
	}

	// 普通方法
	public static String getName(int index) {
		for (Color c : Color.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}
	
	//待实现方法
	public long todo(long duration) {
        throw new AbstractMethodError();
    }

	// get set 方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	// 覆盖方法
	@Override
	public String toString() {
		return this.index + "_" + this.name;
	}

	// 接口方法
	@Override
	public String getInfo() {
		return this.name;
	}

	// 接口方法
	@Override
	public void print() {
		System.out.println(this.index + ":" + this.name);
	}

}

interface Food {
	enum Coffee implements Food {
		BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO
	}

	enum Dessert implements Food {
		FRUIT, CAKE, GELATO
	}
}
