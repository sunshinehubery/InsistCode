package com.sunshine.insist.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2020/2/15 20:49
 * @Version: 1.0
 **/
@Getter
@Setter
public class PmsBaseAttrInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String attrName;
    private String catalog3Id;
    private String isEnabled;
    @Transient
    private List<PmsBaseAttrValue> attrValueList;
}
