package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixixinxiView;


/**
 * 实习信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface ShixixinxiService extends IService<ShixixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixixinxiVO> selectListVO(Wrapper<ShixixinxiEntity> wrapper);
   	
   	ShixixinxiVO selectVO(@Param("ew") Wrapper<ShixixinxiEntity> wrapper);
   	
   	List<ShixixinxiView> selectListView(Wrapper<ShixixinxiEntity> wrapper);
   	
   	ShixixinxiView selectView(@Param("ew") Wrapper<ShixixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixixinxiEntity> wrapper);
   	
}

