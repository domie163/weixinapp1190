package com.dao;

import com.entity.ShixirijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixirijiVO;
import com.entity.view.ShixirijiView;


/**
 * 实习日记
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:59:02
 */
public interface ShixirijiDao extends BaseMapper<ShixirijiEntity> {
	
	List<ShixirijiVO> selectListVO(@Param("ew") Wrapper<ShixirijiEntity> wrapper);
	
	ShixirijiVO selectVO(@Param("ew") Wrapper<ShixirijiEntity> wrapper);
	
	List<ShixirijiView> selectListView(@Param("ew") Wrapper<ShixirijiEntity> wrapper);

	List<ShixirijiView> selectListView(Pagination page,@Param("ew") Wrapper<ShixirijiEntity> wrapper);
	
	ShixirijiView selectView(@Param("ew") Wrapper<ShixirijiEntity> wrapper);
	
}
