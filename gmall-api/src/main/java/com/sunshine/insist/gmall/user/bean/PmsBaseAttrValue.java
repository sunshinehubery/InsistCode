package com.sunshine.insist.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/15 20:51
 * @Version: 1.0
 **/
@Getter
@Setter
public class PmsBaseAttrValue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String valueName;
    private String attrId;
    private String isEnabled;
}
