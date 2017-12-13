package com.hlw.zwd;

import com.hlw.zwd.config.RedisConfig;
import com.hlw.zwd.hash.HashUtil;
import com.hlw.zwd.list.ListUtil;
import com.hlw.zwd.set.SetUtil;
import com.hlw.zwd.string.StringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RedisConfig.class})
public class Main {
    @Bean
    public HashUtil hashUtil(){
        return new HashUtil();
    }
    @Bean
    public ListUtil listUtil(){
        return new ListUtil();
    }
    public SetUtil setUtil(){
        return  new SetUtil();
    }
    @Bean
    public  StringUtil stirng(){
        return new StringUtil();
    }
}
