package com.entity.vo;

import com.entity.DakajiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 打卡记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public class DakajiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 时间
	 */
	
	private String shijian;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 打卡人数
	 */
	
	private Integer dakarenshu;
		
	/**
	 * 未打卡人数
	 */
	
	private Integer weidakarenshu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public String getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：打卡人数
	 */
	 
	public void setDakarenshu(Integer dakarenshu) {
		this.dakarenshu = dakarenshu;
	}
	
	/**
	 * 获取：打卡人数
	 */
	public Integer getDakarenshu() {
		return dakarenshu;
	}
				
	
	/**
	 * 设置：未打卡人数
	 */
	 
	public void setWeidakarenshu(Integer weidakarenshu) {
		this.weidakarenshu = weidakarenshu;
	}
	
	/**
	 * 获取：未打卡人数
	 */
	public Integer getWeidakarenshu() {
		return weidakarenshu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
