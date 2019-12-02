
package acme.features.auditor.jobAudited;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.jobs.Job;
import acme.entities.roles.Auditor;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/auditor/jobAudited/")
public class AuditorJobAuditedController extends AbstractController<Auditor, Job> {

	@Autowired
	private AuditorJobAuditedListService	listService;

	@Autowired
	private AuditorJobAuditedShowService	showService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);

		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
