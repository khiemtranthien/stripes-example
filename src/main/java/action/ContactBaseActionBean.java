package action;

import model.Contact;
import dao.ContactDao;
import dao.mock.MockContactDao;

public class ContactBaseActionBean extends BaseActionBean {
	private ContactDao contactDao = MockContactDao.getInstance();

	private Integer contactId;

	private Contact contact;
	
	protected ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactId(Integer id) {
		contactId = id;
	}

	public Integer getContactId() {
		return contactId;
	}

	public Contact getContact() {
		if (contactId != null) {
			return contactDao.read(contactId);
		}
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
