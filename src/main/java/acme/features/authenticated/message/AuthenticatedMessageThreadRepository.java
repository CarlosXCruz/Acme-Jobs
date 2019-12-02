
package acme.features.authenticated.message;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.messages.MessageThread;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedMessageThreadRepository extends AbstractRepository {

	@Query("select mt from MessageThread mt where mt.id = ?1")
	MessageThread findOneById(int id);

	@Query("select mt from MessageThread mt")
	Collection<MessageThread> findManyByAuthenticatedId(int userId);

	@Query("select p.thread from Participa p where p.user.id = ?1")
	Collection<MessageThread> findThreadByUser(int userId);

}
