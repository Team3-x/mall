package com.tim.mall.coupon.dao;

import com.tim.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tim
 * @email tim@gmail.com
 * @date 2021-12-30 22:35:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
