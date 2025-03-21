package com.entity.view;

import com.entity.ShixixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
@TableName("shixixinxi")
public class ShixixinxiView  extends ShixixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixixinxiView(){
	}
 
 	public ShixixinxiView(ShixixinxiEntity shixixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shixixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
