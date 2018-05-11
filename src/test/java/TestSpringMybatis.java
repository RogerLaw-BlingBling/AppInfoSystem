import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


public class TestSpringMybatis {

    private ApplicationContext applicationContext=null;
    {
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource=applicationContext.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}

