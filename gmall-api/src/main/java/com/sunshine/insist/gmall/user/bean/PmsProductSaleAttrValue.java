package com.sunshine.insist.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/17 14:02
 * @Version: 1.0
 **/
@Getter
@Setter
public class PmsProductSaleAttrValue implements Serializable {
    @Id
    String id ;
    String productId;
    String saleAttrId;
    String saleAttrValueName;
    @Transient
    String isChecked;
}
