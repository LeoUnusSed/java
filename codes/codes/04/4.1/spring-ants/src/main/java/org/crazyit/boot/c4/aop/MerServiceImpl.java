package org.crazyit.boot.c4.aop;

import org.springframework.stereotype.Service;

@Service("merService")
public class MerServiceImpl implements MerService {

    @Override
    public void merService() {
        System.out.println("要代理的商品业务方法");
    }

    
}
