package bean;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean<Person>
{
    /**
     * @return
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    /**
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
