package com.sunshine.insist.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog1;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog2;
import com.sunshine.insist.gmall.user.bean.PmsBaseCatalog3;
import com.sunshine.insist.gmall.user.service.PmsBaseCatalogService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: sunshinehubery
 * @date: 2020/2/15 20:26
 * @Version: 1.0
 **/
@RestController
@CrossOrigin
public class PmsBaseCatalogController {
    @Reference
    private PmsBaseCatalogService pmsBaseCatalogService;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        return pmsBaseCatalogService.getCatalog1();
    }

    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        return pmsBaseCatalogService.getCatalog2(catalog1Id);
    }

    @RequestMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        return pmsBaseCatalogService.getCatalog3(catalog2Id);
    }
}
