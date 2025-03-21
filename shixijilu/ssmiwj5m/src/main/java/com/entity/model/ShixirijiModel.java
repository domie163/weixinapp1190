package com.entity.model;

import com.entity.ShixirijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 实习日记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public class ShixirijiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 添加时间
	 */
	
	private String tianjiashijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 日记标题
	 */
	
	private String rijibiaoti;
		
	/**
	 * 今日体会
	 */
	
	private String jinritihui;
		
	/**
	 * 今日收获
	 */
	
	private String jinrishouhuo;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：添加时间
	 */
	 
	public void setTianjiashijian(String tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	
	/**
	 * 获取：添加时间
	 */
	public String getTianjiashijian() {
		return tianjiashijian;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：日记标题
	 */
	 
	public void setRijibiaoti(String rijibiaoti) {
		this.rijibiaoti = rijibiaoti;
	}
	
	/**
	 * 获取：日记标题
	 */
	public String getRijibiaoti() {
		return rijibiaoti;
	}
				
	
	/**
	 * 设置：今日体会
	 */
	 
	public void setJinritihui(String jinritihui) {
		this.jinritihui = jinritihui;
	}
	
	/**
	 * 获取：今日体会
	 */
	public String getJinritihui() {
		return jinritihui;
	}
				
	
	/**
	 * 设置：今日收获
	 */
	 
	public void setJinrishouhuo(String jinrishouhuo) {
		this.jinrishouhuo = jinrishouhuo;
	}
	
	/**
	 * 获取：今日收获
	 */
	public String getJinrishouhuo() {
		return jinrishouhuo;
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
