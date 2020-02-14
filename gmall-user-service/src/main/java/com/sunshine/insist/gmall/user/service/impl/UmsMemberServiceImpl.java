package com.sunshine.insist.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sunshine.insist.gmall.user.bean.UmsMember;
import com.sunshine.insist.gmall.user.bean.UmsMemberReceiveAddress;
import com.sunshine.insist.gmall.user.mapper.UmsMemberMapper;
import com.sunshine.insist.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.sunshine.insist.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/14 19:26
 * @Version: 1.0
 **/
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllMember() {
        return umsMemberMapper.selectAllMember();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long id) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(id);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }

    @Override
    public UmsMember getMemberById(Long id) {
        return umsMemberMapper.selectByPrimaryKey(id);
    }
}
