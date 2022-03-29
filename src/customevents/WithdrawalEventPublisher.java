package customevents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class WithdrawalEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}
	public void publish() {
		WithdrawalEvent event=new WithdrawalEvent(this);
		
		this.publisher.publishEvent(event);
	}

}
