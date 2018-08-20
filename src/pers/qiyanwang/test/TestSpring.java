package pers.qiyanwang.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.qiyanwang.service.ProductService;

public class TestSpring {

    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
      ProductService s = (ProductService) context.getBean("s");
      s.doSomeService();
    }
}
