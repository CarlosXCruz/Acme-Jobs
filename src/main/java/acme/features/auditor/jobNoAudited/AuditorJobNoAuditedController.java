
package acme.features.auditor.jobNoAudited;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.jobs.Job;
import acme.entities.roles.Auditor;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/auditor/jobNoAudited/")
public class AuditorJobNoAuditedController extends AbstractController<Auditor, Job> {

	@Autowired
	private AuditorJobNoAuditedListService	listService;

	@Autowired
	private AuditorJobNoAuditedShowService	showService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}

}
