package com.entity.view;

import com.entity.ShixirijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习日记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
@TableName("shixiriji")
public class ShixirijiView  extends ShixirijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixirijiView(){
	}
 
 	public ShixirijiView(ShixirijiEntity shixirijiEntity){
 	try {
			BeanUtils.copyProperties(this, shixirijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
