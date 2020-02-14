package com.sunshine.insist.gmall.user.service;

import com.sunshine.insist.gmall.user.bean.UmsMember;
import com.sunshine.insist.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/14 14:23
 * @Version: 1.0.0
 **/
public interface UmsMemberService {
    List<UmsMember> getAllMember();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long id);
    UmsMember getMemberById(Long id);
}
