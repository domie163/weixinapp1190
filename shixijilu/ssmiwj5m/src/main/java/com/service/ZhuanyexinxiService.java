package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyexinxiView;


/**
 * 专业信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface ZhuanyexinxiService extends IService<ZhuanyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyexinxiVO> selectListVO(Wrapper<ZhuanyexinxiEntity> wrapper);
   	
   	ZhuanyexinxiVO selectVO(@Param("ew") Wrapper<ZhuanyexinxiEntity> wrapper);
   	
   	List<ZhuanyexinxiView> selectListView(Wrapper<ZhuanyexinxiEntity> wrapper);
   	
   	ZhuanyexinxiView selectView(@Param("ew") Wrapper<ZhuanyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyexinxiEntity> wrapper);
   	
}

