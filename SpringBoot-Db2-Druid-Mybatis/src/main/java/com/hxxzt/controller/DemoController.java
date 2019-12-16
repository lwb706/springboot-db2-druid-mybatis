package com.hxxzt.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.hxxzt.entity.MobileNews;
import com.hxxzt.service.ITestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DemoController {

    @Resource
    private ITestService testService;

    @RequestMapping("/mobile")
    public List<MobileNews> getMobileList(){
        return testService.SelectMobile();
    }

    @RequestMapping("/start/druid")
    public Object druidStart(){
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}