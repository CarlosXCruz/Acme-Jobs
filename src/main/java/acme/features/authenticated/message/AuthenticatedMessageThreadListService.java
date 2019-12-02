
package acme.features.authenticated.message;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.messages.MessageThread;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedMessageThreadListService implements AbstractListService<Authenticated, MessageThread> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AuthenticatedMessageThreadRepository repository;


	// AbstractListService<Authenticated, MessageThread> interface ----------------

	@Override
	public boolean authorise(final Request<MessageThread> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<MessageThread> request, final MessageThread entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "users");
	}

	@Override
	public Collection<MessageThread> findMany(final Request<MessageThread> request) {
		assert request != null;

		Collection<MessageThread> result;
		Principal principal;

		principal = request.getPrincipal();
		result = this.repository.findThreadByUser(principal.getActiveRoleId());

		return result;
	}

}