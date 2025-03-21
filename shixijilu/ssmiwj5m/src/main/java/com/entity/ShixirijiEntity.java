package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 实习日记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
@TableName("shixiriji")
public class ShixirijiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixirijiEntity() {
		
	}
	
	public ShixirijiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 日记编号
	 */
					
	private String rijibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：日记编号
	 */
	public void setRijibianhao(String rijibianhao) {
		this.rijibianhao = rijibianhao;
	}
	/**
	 * 获取：日记编号
	 */
	public String getRijibianhao() {
		return rijibianhao;
	}
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
