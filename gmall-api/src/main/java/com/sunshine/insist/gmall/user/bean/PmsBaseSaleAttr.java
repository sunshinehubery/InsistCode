package com.sunshine.insist.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/17 14:27
 * @Version: 1.0
 **/
@Getter
@Setter
public class PmsBaseSaleAttr implements Serializable {
    @Id
    private String id;
    private String name;
}
