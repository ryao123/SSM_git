package cn.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.dao.ProviderDao;
import cn.ssm.pojo.Provider;
import cn.ssm.service.ProviderService;
@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderDao providerDao;
    @Override
    public List<Provider> getList() {
        // TODO Auto-generated method stub
        return providerDao.getProList();
    }

}
