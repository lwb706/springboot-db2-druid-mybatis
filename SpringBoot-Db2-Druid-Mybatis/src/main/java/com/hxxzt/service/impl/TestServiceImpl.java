package com.hxxzt.service.impl;

import com.hxxzt.dao.MobileNewsDao;
import com.hxxzt.entity.MobileNews;
import com.hxxzt.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ITestService")
public class TestServiceImpl implements ITestService {

    @Resource
    private MobileNewsDao mobileNewsDao;

    @Override
    public List<MobileNews> SelectMobile() {
        return mobileNewsDao.All();
    }
}