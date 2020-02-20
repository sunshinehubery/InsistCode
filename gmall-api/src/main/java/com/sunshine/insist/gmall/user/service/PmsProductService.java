package com.sunshine.insist.gmall.user.service;

import com.sunshine.insist.gmall.user.bean.PmsBaseSaleAttr;
import com.sunshine.insist.gmall.user.bean.PmsProductImage;
import com.sunshine.insist.gmall.user.bean.PmsProductInfo;
import com.sunshine.insist.gmall.user.bean.PmsProductSaleAttr;

import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/17 14:04
 * @Version: 1.0
 **/
public interface PmsProductService {
    List<PmsProductInfo> getPmsProductInfoByCatalog3Id(String catalog3Id);
    List<PmsBaseSaleAttr> getPmsBaseSaleAttrList();
    void savePmsProductInfo(PmsProductInfo pmsProductInfo);
    List<PmsProductSaleAttr> getPmsProductSaleAttrByProductId(String productId);
    List<PmsProductImage> getPmsProductImageByProductId(String productId);
}
