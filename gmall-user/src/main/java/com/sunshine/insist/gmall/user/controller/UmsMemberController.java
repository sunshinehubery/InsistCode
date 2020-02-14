package com.sunshine.insist.gmall.user.controller;

import com.sunshine.insist.gmall.user.bean.UmsMember;
import com.sunshine.insist.gmall.user.bean.UmsMemberReceiveAddress;
import com.sunshine.insist.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2020/2/14 14:27
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/member")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;
    @GetMapping("/list")
    public List<UmsMember> getAllMember(){
        return umsMemberService.getAllMember();
    }
    @GetMapping("/{id}")
    public UmsMember getMemberById(@PathVariable Long id){
        return umsMemberService.getMemberById(id);
    }
    @GetMapping("/getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long id){
        return umsMemberService.getReceiveAddressByMemberId(id);
    }
}
