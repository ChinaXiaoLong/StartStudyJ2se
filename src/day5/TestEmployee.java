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
		System.out.println("�����ǣ�" + p.getName() + "\n�����ǣ�" + p.getAge() + "\nְλ�ǣ�" + p.getPosition() + "\n�����ǣ�" + p.getSalary());
	}

}
