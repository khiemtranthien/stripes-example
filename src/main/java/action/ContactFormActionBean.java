package action;

import model.Contact;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SimpleMessage;

public class ContactFormActionBean extends ContactBaseActionBean {
	private static final String FORM = "/WEB-INF/jsp/contact_form.jsp";

	@DefaultHandler
	public Resolution form() {
		return new ForwardResolution(FORM);
	}

	public Resolution save() {
		Contact contact = getContact();
		getContactDao().save(contact);
		getContext().getMessages().add(
				new SimpleMessage("{0} has been saved.", contact));
		return new RedirectResolution(ContactListActionBean.class);
	}
	
	public Resolution cancel() {
		getContext().getMessages().add(
				new SimpleMessage("Action cancelled."));
		return new RedirectResolution(ContactListActionBean.class);
	}
}