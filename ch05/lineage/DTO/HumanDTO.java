package ch05.lineage.DTO;

public class HumanDTO { // 부모 클래스
	
	// 필드
	private String name;
	private String sex;
	private int level;
	private int hp;
	private int mp;
	private int money;
	
	
	// 생성자
	
	
	// 메서드
	
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getLevel() {
		return level;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getMoney() {
		return money;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
