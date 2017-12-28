package com.youotech.data.Impl;

import com.youotech.bean.SpittleBean;
import com.youotech.data.SpittleRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {

    public List<SpittleBean> findSpittles(long max, int count) {

        List<SpittleBean> spittleBeans = new ArrayList<SpittleBean>();
        for (long i = 0L;i < count;i ++){
            spittleBeans.add(new SpittleBean(i,"MSG:" + i,new Date(),0d,0d));
        }
        return  spittleBeans;
    }

    public SpittleBean findOne(long id) {
        return new SpittleBean(id,"findOne",new Date(),0d,0d);
    }
}
