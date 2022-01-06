package com.tim.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.common.utils.PageUtils;
import com.tim.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author tim
 * @email tim@gmail.com
 * @date 2021-12-30 22:35:05
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

