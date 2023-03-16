package api.lang;

public class Owner {
	String name;
	String cellPhone;
	
	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}
	
	@Override
	public boolean equals(Object obj) {
		Owner o = (Owner) obj;
		if(this.name == o.name) {
			return true;
		}else {
			return false;			
		}
	}
	
	@Override
	public String toString() {
		return "이름은 " + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	
}
