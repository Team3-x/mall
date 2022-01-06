package com.tim.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.common.utils.PageUtils;
import com.tim.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author tim
 * @email tim@gmail.com
 * @date 2021-12-30 22:47:17
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

