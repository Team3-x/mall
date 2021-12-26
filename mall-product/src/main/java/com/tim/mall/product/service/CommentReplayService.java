package com.tim.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.common.utils.PageUtils;
import com.tim.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author tim
 * @email tim@gmail.com
 * @date 2021-12-23 22:54:55
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

