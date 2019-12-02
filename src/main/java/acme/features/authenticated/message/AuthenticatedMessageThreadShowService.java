
package acme.features.authenticated.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.messages.MessageThread;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedMessageThreadShowService implements AbstractShowService<Authenticated, MessageThread> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AuthenticatedMessageThreadRepository repository;


	// AbstractShowService<Authenticated, MessageThread> interface ----------------

	@Override
	public boolean authorise(final Request<MessageThread> request) {
		assert request != null;

		//		boolean result;
		//		int messageThreadId;
		//		MessageThread messageThread;
		//		Authenticated authenticated;
		//		Principal principal;
		//
		//		messageThreadId = request.getModel().getInteger("id");
		//		messageThread = this.repository.findOneById(messageThreadId);
		//		authenticated = messageThread.get;
		//		principal = request.getPrincipal();
		//		result = authenticated.getUserAccount().getId();

		return true;
	}

	@Override
	public void unbind(final Request<MessageThread> request, final MessageThread entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "creationMoment", "users");
	}

	@Override
	public MessageThread findOne(final Request<MessageThread> request) {
		assert request != null;

		MessageThread result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
