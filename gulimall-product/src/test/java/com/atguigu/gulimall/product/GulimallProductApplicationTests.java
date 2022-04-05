package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

@SpringBootTest
@Slf4j
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setBrandId(4L);
        brandEntity.setDescript("肾机一肾难求");

//        brandEntity.setName("iPhone100plus");
//        brandService.save(brandEntity);
//        System.out.println("保存成功...");

        brandService.updateById(brandEntity);

    }
//    @Autowired
//    OSSClient ossClient;
//
//    @Test
//    public void testUpload() throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream("/Users/jiangangliu/Downloads/2.png");
//        ossClient.putObject("liujiangang-ljg","2.png",inputStream);
//        //关闭OSSClient
//        ossClient.shutdown();
//        System.out.println("上传完成...");
//
//    }
    @Autowired
    CategoryService categoryService;

    @Test
    public void TestFindPath(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径:{}", Arrays.asList(catelogPath));

    }

}
