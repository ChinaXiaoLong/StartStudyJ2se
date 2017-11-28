package day5;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee p = new Employee();
		p.setName("tom");
		p.setAge(23);
		p.setPosition("ssdf");
		p.setSalary(23);
		System.out.println("姓名是：" + p.getName() + "\n年龄是：" + p.getAge() + "\n职位是：" + p.getPosition() + "\n工资是：" + p.getSalary());
	}

}
