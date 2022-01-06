package com.tim.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.common.utils.PageUtils;
import com.tim.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author tim
 * @email tim@gmail.com
 * @date 2021-12-30 22:47:17
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

