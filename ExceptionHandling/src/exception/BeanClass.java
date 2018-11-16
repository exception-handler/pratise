package exception;

public class BeanClass {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BeanClass [id=" + id + ", name=" + name + "]";
	}
	public BeanClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public BeanClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
