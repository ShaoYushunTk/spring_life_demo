package spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Canway
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-life.xml");
        PersonBean personBean = (PersonBean) applicationContext.getBean("personBean");
        personBean.work();
        applicationContext.close();
    }
}
