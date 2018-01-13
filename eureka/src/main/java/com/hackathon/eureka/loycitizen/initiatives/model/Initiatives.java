package com.hackathon.eureka.loycitizen.initiatives.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hackathon.eureka.loycitizen.util.EurekaUtil;
import com.hackathon.eureka.loycitizen.vo.CreateRequestVO;

//LoyCitizen LoyCitizenUser
@Entity
@Table(name = "EUREKA_INITIATIVES")
public class Initiatives {
	
	@Id
	@Column(name = "initiative_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long initiativeId;

	@Column(name = "member_id", nullable = false)
	Long memberId;
	
	@Column(name = "service_id")
	private Long serviceId;
	
	@Column(name = "initiative_type")
	private String initiativeType;

	@Column(name = "post")
	private String post;

	@Column(name = "location")
	private String location;
	
	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;
	
	

	public Initiatives(CreateRequestVO vo) {
		this.memberId = vo.getMemberId();
		this.serviceId = vo.getServiceId();
		this.initiativeType = vo.getInitiativeType();
		this.post = vo.getPost();
		this.location = vo.getLocation();
		this.createdDate = EurekaUtil.convertStringToDate(vo.getCreatedDate());
		this.startDate= EurekaUtil.convertStringToDate(vo.getStartDate());
		this.endDate= EurekaUtil.convertStringToDate(vo.getEndDate());
	}
	public Initiatives(){}
	public Long getInitiativeId() {
		return initiativeId;
	}
	public void setInitiativeId(Long initiativeId) {
		this.initiativeId = initiativeId;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public String getInitiativeType() {
		return initiativeType;
	}
	public void setInitiativeType(String initiativeType) {
		this.initiativeType = initiativeType;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	};
	
	
	
}
