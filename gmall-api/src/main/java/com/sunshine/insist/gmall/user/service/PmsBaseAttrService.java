package com.sunshine.insist.gmall.user.service;

import com.sunshine.insist.gmall.user.bean.PmsBaseAttrInfo;
import com.sunshine.insist.gmall.user.bean.PmsBaseAttrValue;

import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/15 20:54
 * @Version: 1.0
 **/
public interface PmsBaseAttrService {
    List<PmsBaseAttrInfo> getAttrInfoByCatalog3Id(String catalog3Id);
    List<PmsBaseAttrValue> getAttrValueByAttrId(String attrId);
    void savePmsBaseAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);
}
