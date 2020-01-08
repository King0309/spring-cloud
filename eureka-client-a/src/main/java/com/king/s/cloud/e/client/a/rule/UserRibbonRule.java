package com.king.s.cloud.e.client.a.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class UserRibbonRule extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(ILoadBalancer lb, Object key) {
        List<Server> upList = lb.getAllServers();

        return upList.get(0);
    }

    @Override
    public Server choose(Object o) {
        return this.choose(this.getLoadBalancer(), o);
    }
}
