package com.sunshine.insist.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/17 13:46
 * @Version: 1.0
 **/
@Getter
@Setter
public class PmsProductImage implements Serializable {
    @Id
    private String id;
    private String productId;
    private String imgName;
    private String imgUrl;
}
