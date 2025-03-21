package com.dao;

import com.entity.ShixixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixixinxiVO;
import com.entity.view.ShixixinxiView;


/**
 * 实习信息
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface ShixixinxiDao extends BaseMapper<ShixixinxiEntity> {
	
	List<ShixixinxiVO> selectListVO(@Param("ew") Wrapper<ShixixinxiEntity> wrapper);
	
	ShixixinxiVO selectVO(@Param("ew") Wrapper<ShixixinxiEntity> wrapper);
	
	List<ShixixinxiView> selectListView(@Param("ew") Wrapper<ShixixinxiEntity> wrapper);

	List<ShixixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShixixinxiEntity> wrapper);
	
	ShixixinxiView selectView(@Param("ew") Wrapper<ShixixinxiEntity> wrapper);
	
}
