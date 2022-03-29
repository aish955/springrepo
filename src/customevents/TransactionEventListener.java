package customevents;

import org.springframework.context.ApplicationListener;

public class TransactionEventListener implements ApplicationListener<WithdrawalEvent> {
private void sendSMS() {
	
}

@Override
public void onApplicationEvent(WithdrawalEvent event) {
	sendSMS();
	System.out.println("Withdrawal event raised");
}

}
