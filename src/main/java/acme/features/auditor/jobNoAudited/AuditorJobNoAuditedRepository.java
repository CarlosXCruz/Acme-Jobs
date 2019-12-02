
package acme.features.auditor.jobNoAudited;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.jobs.Job;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuditorJobNoAuditedRepository extends AbstractRepository {

	@Query("select a from Job a where a.id = ?1")
	Job findOneById(int id);

	@Query("select a from Job a where a.deadline > ?1 and  a.status = 'published' ")
	Collection<Job> findManyActive(Date ln);

	@Query("select a from Job a where id not in (select b.job.id from AuditRecord b where b.auditor.id =?1) and  a.status = 'published'")
	Collection<Job> listJobNoAudited(int id);

}
