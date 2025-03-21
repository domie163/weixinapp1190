package com.dao;

import com.entity.DakajiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DakajiluVO;
import com.entity.view.DakajiluView;


/**
 * 打卡记录
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface DakajiluDao extends BaseMapper<DakajiluEntity> {
	
	List<DakajiluVO> selectListVO(@Param("ew") Wrapper<DakajiluEntity> wrapper);
	
	DakajiluVO selectVO(@Param("ew") Wrapper<DakajiluEntity> wrapper);
	
	List<DakajiluView> selectListView(@Param("ew") Wrapper<DakajiluEntity> wrapper);

	List<DakajiluView> selectListView(Pagination page,@Param("ew") Wrapper<DakajiluEntity> wrapper);
	
	DakajiluView selectView(@Param("ew") Wrapper<DakajiluEntity> wrapper);
	
}
