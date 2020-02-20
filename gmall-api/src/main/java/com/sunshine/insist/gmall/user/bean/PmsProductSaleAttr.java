package com.sunshine.insist.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/17 13:45
 * @Version: 1.0
 **/
@Getter
@Setter
public class PmsProductSaleAttr implements Serializable {
    @Id
    private String id;
    private String productId;
    private String saleAttrId;
    private String saleAttrName;
    @Transient
    private List<PmsProductSaleAttrValue> spuSaleAttrValueList;
}
