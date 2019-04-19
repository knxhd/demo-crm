package com.mikasa.custom.service.impl;

import com.mikasa.custom.dao.TestDao;
import com.mikasa.custom.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @description
 * @author: tianluhua
 * @date 2019/4/19 12:58
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<String> getCityName() {
        return testDao.getCityName();
    }
}
