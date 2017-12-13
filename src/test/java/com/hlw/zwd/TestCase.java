package com.hlw.zwd;

import com.hlw.zwd.config.RedisConfig;
import com.hlw.zwd.string.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Main.class, RedisConfig.class})
public class TestCase {
    @Autowired
    private StringUtil stringUtil;
    @Test
    public void test1(){
        stringUtil.set("name","zwd");
        System.out.println(stringUtil.get("name"));
    }
}
