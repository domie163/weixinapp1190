package com.entity.view;

import com.entity.XueshengdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生打卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
@TableName("xueshengdaka")
public class XueshengdakaView  extends XueshengdakaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengdakaView(){
	}
 
 	public XueshengdakaView(XueshengdakaEntity xueshengdakaEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengdakaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
