package com.tim.mall.product.dao;

import com.tim.mall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author tim
 * @email tim@gmail.com
 * @date 2021-12-23 22:54:55
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
