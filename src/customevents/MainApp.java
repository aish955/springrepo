package customevents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		WithdrawalEventPublisher publisher=(WithdrawalEventPublisher) context.getBean("WithdrawalEventPublisher");
		BankAccount bankacc1=new SavingsAccount(123,"aishwarya",20000);
		double amt=bankacc1.withdraw(10000);
		System.out.println(amt);

	}

}
