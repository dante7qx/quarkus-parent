package org.dante.quarkus.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 消息VO
 * 
 * @author dante
 */
public class MsgVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8",  pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date;
	
	public MsgVO() {}
	
	public MsgVO(String id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MsgVO [id=" + id + ", name=" + name + ", date=" + date + "]";
	}
}
