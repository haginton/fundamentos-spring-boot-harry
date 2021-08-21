package com.fundamentosplatzi.springboot.fundamentos;

import com.fundamentosplatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosplatzi.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamentosplatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	//Primera forma de inyectar una dependencia
	/*@Autowired
	@Qualifier("componentTwoImplement")*/
	private ComponentDependency componentDependency; //Inyección de la dependencia
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyBeanWithProperties myBeanWithProperties;

	//Segunda forma de inyectar una dependencia
	@Autowired
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency
			, MyBean myBean
			, MyBeanWithDependency myBeanWithDependency
			, MyBeanWithProperties myBeanWithProperties){ //Inyección de la dependencia (se usa la anotación @Qualifier y se indica 1 de las clases que implementa la interfaz que esta inyectando la dependencia la primera letra en minuscula
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myBeanWithProperties = myBeanWithProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar(); //implementación de la dependencia
		myBean.print();
		myBeanWithDependency.printWithDependency();
		System.out.println(myBeanWithProperties.function());
	}
}
