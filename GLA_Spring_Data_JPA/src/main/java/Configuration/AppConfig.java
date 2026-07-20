package Configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

//import jakarta.persistence.EntityManagerFactory;
//import jakarta.transaction.TransactionManager;

@Configuration
public class AppConfig {
	
	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/GLA_JPA");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
		
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		
		LocalContainerEntityManagerFactoryBean lc = new LocalContainerEntityManagerFactoryBean();
		lc.setDataSource(dataSource());
		lc.setPackagesToScan("Entity");
		
		HibernateJpaVendorAdapter h = new HibernateJpaVendorAdapter();
		lc.setJpaVendorAdapter(h);
		
		Properties p = new Properties();
		p.put("hibernate.show_sql", "true");
		p.put("hibernate.format_sql", "true");
		p.put("hibernate.hbm2ddl.auto", "create");
		
		lc.setJpaProperties(p);
		
		return lc;
		
	}
	
	@Bean
	public JpaTransactionManager transactionManager() {
		
		JpaTransactionManager jpa = new JpaTransactionManager();
		jpa.setEntityManagerFactory(entityManagerFactory().getObject());
		return jpa;
		
	}
}