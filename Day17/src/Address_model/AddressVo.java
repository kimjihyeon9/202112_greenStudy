package Address_model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class AddressVo implements Externalizable {
	private int no;
	private String name;
	private String phone;
	private String addr;
	private String email;
	
	public AddressVo() {
		this(0, "", "", "", "");
	}
	
	public AddressVo(int no, String name, String phone, String addr, String email) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public int hashCode() {  // 주소 개념
		// 문자값을 숫자로 바꿔주는 역할
		// 이퀄할 때 주소가 맞는지 판단해야한다. 객체 정보가 같은지 확인
		// 1순위 주소가 같은지 확인하기 위한 판단
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) { // 주소가 다를 때 어떤 것을 비교하는지 위한 것
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressVo other = (AddressVo) obj;
		return no == other.no;
	}

	@Override
	public String toString() {
		return no + " " + name + " " + phone + " " + addr + " " + email;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(no);
		out.writeUTF(name);
		out.writeUTF(phone);
		out.writeUTF(addr);
		out.writeUTF(email);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		no = in.read();
		name = in.readUTF();
		phone = in.readUTF();
		addr = in.readUTF();
		email = in.readUTF();
	}
}
