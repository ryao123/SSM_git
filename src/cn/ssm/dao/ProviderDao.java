package cn.ssm.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import cn.ssm.pojo.Provider;
import cn.ssm.pojo.User;
@Repository
public interface ProviderDao {
    List<Provider> getProList();
}
