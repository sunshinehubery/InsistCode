package com.sunshine.insist.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sunshine.insist.gmall.user.bean.PmsBaseAttrInfo;
import com.sunshine.insist.gmall.user.bean.PmsBaseAttrValue;
import com.sunshine.insist.gmall.user.service.PmsBaseAttrService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/15 20:59
 * @Version: 1.0
 **/
@RestController
@CrossOrigin
public class PmsBaseAttrController {
    @Reference
    private PmsBaseAttrService pmsBaseAttrService;

    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> getAttrInfoByCatalog3Id(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfoList = pmsBaseAttrService.getAttrInfoByCatalog3Id(catalog3Id);
        for(PmsBaseAttrInfo pmsBaseAttrInfo : pmsBaseAttrInfoList){
            List<PmsBaseAttrValue> pmsBaseAttrValueList = pmsBaseAttrService.getAttrValueByAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrInfo.setAttrValueList(pmsBaseAttrValueList);
        }
        return pmsBaseAttrInfoList;
    }

    @RequestMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValueByAttrId(String attrId){
        return pmsBaseAttrService.getAttrValueByAttrId(attrId);
    }

    @RequestMapping("saveAttrInfo")
    public String savePmsBaseAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        pmsBaseAttrService.savePmsBaseAttrInfo(pmsBaseAttrInfo);
        return "redirect:attrInfoList?"+pmsBaseAttrInfo.getCatalog3Id();
    }
}
