package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixigonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixigonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixigonggaoView;


/**
 * 实习公告
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface ShixigonggaoService extends IService<ShixigonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixigonggaoVO> selectListVO(Wrapper<ShixigonggaoEntity> wrapper);
   	
   	ShixigonggaoVO selectVO(@Param("ew") Wrapper<ShixigonggaoEntity> wrapper);
   	
   	List<ShixigonggaoView> selectListView(Wrapper<ShixigonggaoEntity> wrapper);
   	
   	ShixigonggaoView selectView(@Param("ew") Wrapper<ShixigonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixigonggaoEntity> wrapper);
   	
}

