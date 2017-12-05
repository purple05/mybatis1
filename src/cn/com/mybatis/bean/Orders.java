package cn.com.mybatis.bean;

import java.util.Date;
import java.util.List;

public class Orders {
	private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;
    
    //用户信息
    private User user;
    
  //订单明细
    private List<Orderdetail> orderdetails;
    
    

	public List<Orderdetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(Integer id, Integer userId, String number, Date createtime, String note, User user,
			List<Orderdetail> orderdetails) {
		super();
		this.id = id;
		this.userId = userId;
		this.number = number;
		this.createtime = createtime;
		this.note = note;
		this.user = user;
		this.orderdetails = orderdetails;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + ", user=" + user + ", orderdetails=" + orderdetails + "]";
	}

	
    
}
