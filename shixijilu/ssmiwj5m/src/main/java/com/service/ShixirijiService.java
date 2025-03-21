package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixirijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixirijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixirijiView;


/**
 * 实习日记
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface ShixirijiService extends IService<ShixirijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixirijiVO> selectListVO(Wrapper<ShixirijiEntity> wrapper);
   	
   	ShixirijiVO selectVO(@Param("ew") Wrapper<ShixirijiEntity> wrapper);
   	
   	List<ShixirijiView> selectListView(Wrapper<ShixirijiEntity> wrapper);
   	
   	ShixirijiView selectView(@Param("ew") Wrapper<ShixirijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixirijiEntity> wrapper);
   	
}

