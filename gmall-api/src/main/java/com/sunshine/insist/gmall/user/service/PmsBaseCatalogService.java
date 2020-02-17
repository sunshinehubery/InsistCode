package com.sunshine.insist.gmall.user.service;

import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog1;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog2;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/15 19:28
 * @Version: 1.0
 **/
public interface PmsBaseCatalogService {
    List<PmsBaseCatalog1> getCatalog1();
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
