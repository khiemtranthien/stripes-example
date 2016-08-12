package action;

import java.util.List;

import model.Contact;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.SimpleMessage;

public class ContactListActionBean extends ContactBaseActionBean {
	private static final String LIST = "/WEB-INF/jsp/contact_list.jsp";
	private static final String VIEW = "/WEB-INF/jsp/contact_view.jsp";

	@DefaultHandler
	public Resolution list() {
		return new ForwardResolution(LIST);
	}

	public Resolution view() {
		return new ForwardResolution(VIEW);
	}
	
	public List<Contact> getContacts() {
		return getContactDao().read();
	}
	
	public Resolution delete() {
		Contact deleted = getContactDao().read(getContactId());
		getContactDao().delete(getContactId());
		getContext().getMessages().add(new SimpleMessage("Deleted {0}." , deleted.getFirstName()));
		return new RedirectResolution(ContactListActionBean.class);
	}
	
}
