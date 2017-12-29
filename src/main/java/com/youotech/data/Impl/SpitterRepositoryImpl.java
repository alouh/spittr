package com.youotech.data.Impl;

import com.youotech.bean.SpitterBean;
import com.youotech.data.SpitterRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SpitterRepositoryImpl implements SpitterRepository{

    private Map<String,SpitterBean> map = new HashMap<String, SpitterBean>();

    public SpitterBean findByUserName(String userName) {

        return map.get(userName);
    }

    public void save(SpitterBean userBean) {
        map.put(userBean.getUserName(),userBean);
    }
}
