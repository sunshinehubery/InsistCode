package com.sunshine.insist.gmall.user.mapper;

import com.sunshine.insist.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UmsMemberMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllMember();
}