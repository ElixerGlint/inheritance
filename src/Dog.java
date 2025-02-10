public class Dog extends animal implements Enemy{
	private String name; 
	private int age;

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name: " + name +"\n" + "age: " + age + "\n";
	}
	
	public String speak() {
		return "Bark";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String attack() {
		// TODO Auto-generated method stub
		return "Bite";
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'move'");
	}

	@Override
	public boolean getKilled() {
		if (age < 0) {
			return false;
		}
		age = -1;
		return true;
	}
	
}