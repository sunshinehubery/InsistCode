package com.sunshine.insist.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sunshine.insist.gmall.manage.utils.PmsUploadUtil;
import com.sunshine.insist.gmall.user.bean.PmsBaseSaleAttr;
import com.sunshine.insist.gmall.user.bean.PmsProductImage;
import com.sunshine.insist.gmall.user.bean.PmsProductInfo;
import com.sunshine.insist.gmall.user.bean.PmsProductSaleAttr;
import com.sunshine.insist.gmall.user.service.PmsProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @description:
 * @author: sunshine
 * @date: 2020/2/17 14:11
 * @Version: 1.0
 **/
@RestController
@CrossOrigin
public class PmsProductController {
    @Reference
    private PmsProductService pmsProductService;

    @RequestMapping("/productList")
    public List<PmsProductInfo> getPmsProductInfoByCatalog3Id(String catalog3Id){
        return pmsProductService.getPmsProductInfoByCatalog3Id(catalog3Id);
    }

    @RequestMapping("/baseSaleAttrList")
    public List<PmsBaseSaleAttr> getPmsBaseSaleAttrList(){
        return pmsProductService.getPmsBaseSaleAttrList();
    }

    @RequestMapping("/saveSpuInfo")
    public String savePmsProductInfo(@RequestBody PmsProductInfo pmsProductInfo){
        pmsProductService.savePmsProductInfo(pmsProductInfo);
        return "redirect:spuList?" + pmsProductInfo.getCatalog3Id();
    }

    //通过PmsUploadUtil将图片上传到fastfds
    @RequestMapping("/fileUpload")
    public String fileUpload(@RequestParam("file")MultipartFile multipartFile){
        return PmsUploadUtil.uploadImage(multipartFile);
    }

    @RequestMapping("/productSaleAttrList")
    public List<PmsProductSaleAttr> getPmsProductSaleAttrByProductId(String spuId){
        return pmsProductService.getPmsProductSaleAttrByProductId(spuId);
    }

    @RequestMapping("/productImageList")
    public List<PmsProductImage> getPmsProductImageByProductId(String spuId){
        return pmsProductService.getPmsProductImageByProductId(spuId);
    }
}
