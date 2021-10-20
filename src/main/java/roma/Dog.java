package roma;

public class Dog {
	private String name;
	private int level;
	private Flea flea;

	public Dog() {
	}

	public Dog(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Flea getFlea() {
		return flea;
	}

	public void setFlea(Flea flea) {
		this.flea = flea;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", level=" + level + ", flea=" + flea + "]";
	}

}
