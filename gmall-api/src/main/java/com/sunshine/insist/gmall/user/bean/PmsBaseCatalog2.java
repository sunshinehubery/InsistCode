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
 * @author: sunshine
 * @date: 2020/2/15 19:22
 * @Version: 1.0
 **/
@Getter
@Setter
public class PmsBaseCatalog2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String catalog1Id;
    @Transient
    private List<PmsBaseCatalog3> catalog3List;
}
