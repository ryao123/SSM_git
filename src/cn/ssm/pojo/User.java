package cn.ssm.pojo;
/**
 * �����ݿ��smbms_user��Ӧ��һ��javaʵ����
 * @author lindy
 * @����ʱ�� 2020��3��24������10:59:06
 */

import java.util.Date;
import java.util.List;

public class User {
	private int id;// ����id
	private String userCode;// �û�����
	private String userName;// �û���
	private String userPassword;// ����
	private int gender;// �Ա�
	private Date birthday;// ��������
	private String phone;// ��ϵ��ʽ
	private String address;// ��ַ
	private int userRole;// �û���ɫid
	private int createdBy;// ������id
	private Date creationDate;// ����ʱ��
	private int modifyBy;// �޸���id
	private Date modifyDate;// �޸�ʱ��
	// 1��1  ��һ���Զ����������������
	// resultMap�ĸ߼�ӳ��
	// 1��һ ������һ�������javaʵ����
	//private Role role; // ��ɫ��
	
	//���һ�����ԣ�������û������е�ַ��Ϣ  1��id��Ӧ�ж������������
	// һ�Զ� ��ʾ�����������һ���б�(�����)
	//private List<Address> adds;
	
	/*
	 * private String roleName; public String getRoleName() { return roleName; }
	 * public void setRoleName(String roleName) { this.roleName = roleName; }
	 */
	 
    /*public List<Address> getAdds() {
    	return adds;
    }
    public void setAdds(List<Address> adds) {
    	this.adds = adds;
    }*/
    /*public Role getRole() {
    	return role;
    }
    public void setRole(Role role) {
    	this.role = role;
    }*/
	public User() {
		super();
	}
	public User(String userName, int userRole) {
		this.userName=userName;
		this.userRole=userRole;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
