package RudyRentSystem.entity;

import java.sql.Date;

public class Video extends Thing {
	private int id;
	private String name;
	private Date createDate;
	private String serial;
	
	

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", name=" + name + ", createDate=" + createDate + "]";
	}

}
