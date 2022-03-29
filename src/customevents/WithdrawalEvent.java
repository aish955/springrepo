package customevents;

import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent {

	public WithdrawalEvent(Object source) {
		super(source);
		
	}

	@Override
	public String toString() {
		return "Amount Withdrawn";
	}

}
