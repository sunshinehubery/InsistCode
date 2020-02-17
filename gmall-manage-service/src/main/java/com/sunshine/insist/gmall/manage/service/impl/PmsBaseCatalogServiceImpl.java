package com.sunshine.insist.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sunshine.insist.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.sunshine.insist.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.sunshine.insist.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog1;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog2;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog3;
import com.sunshine.insist.gmall.user.service.PmsBaseCatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2020/2/15 20:16
 * @Version: 1.0
 **/
@Service
public class PmsBaseCatalogServiceImpl implements PmsBaseCatalogService {
    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return pmsBaseCatalog2Mapper.select(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);
    }
}
