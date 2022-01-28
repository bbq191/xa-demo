package com.example.xademo;

import com.example.xademo.service.XAService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class XaDemoApplicationTests {
  @Autowired private XAService xaService;

  @Test
  public void contextLoads() {}

  @Test
  public void testXA() {

    xaService.testXA();
  }
}
