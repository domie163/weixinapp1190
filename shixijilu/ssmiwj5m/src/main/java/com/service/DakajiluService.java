package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DakajiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DakajiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DakajiluView;


/**
 * 打卡记录
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface DakajiluService extends IService<DakajiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DakajiluVO> selectListVO(Wrapper<DakajiluEntity> wrapper);
   	
   	DakajiluVO selectVO(@Param("ew") Wrapper<DakajiluEntity> wrapper);
   	
   	List<DakajiluView> selectListView(Wrapper<DakajiluEntity> wrapper);
   	
   	DakajiluView selectView(@Param("ew") Wrapper<DakajiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DakajiluEntity> wrapper);
   	
}

