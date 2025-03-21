package com.entity.view;

import com.entity.ShixigonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实习公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
@TableName("shixigonggao")
public class ShixigonggaoView  extends ShixigonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixigonggaoView(){
	}
 
 	public ShixigonggaoView(ShixigonggaoEntity shixigonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, shixigonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
