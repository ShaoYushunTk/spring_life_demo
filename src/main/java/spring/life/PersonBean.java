package spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class PersonBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, BeanClassLoaderAware {

    private Integer id;

    private String name;

    public PersonBean() {
        System.out.println("1.PersonBean()");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        System.out.println("2.setId");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("3.setName");
    }



    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("6.setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("4.setBeanName");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("5.setBeanClassLoader");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("8.afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("9.initMethod");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("11.destroy");
    }

    public void destroyMethod() {
        System.out.println("12.destroyMethod");
    }

    public void work() {
        System.out.println(getId() + "-" + getName() + " is working");
    }

}
