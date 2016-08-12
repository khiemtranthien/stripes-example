package action;

import java.util.Date;
import java.util.Random;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

public class HelloActionBean extends BaseActionBean {

	private Date date;/* (2) */

	public Date getDate() {
		return date;
	}

	@DefaultHandler
	public Resolution getCurrentDate() {
		date = new Date();
		return new ForwardResolution(VIEW);
	}

	public Resolution randomDate() {
		long max = System.currentTimeMillis();
		long random = new Random().nextLong() % max;
		date = new Date(random);
		return new ForwardResolution(VIEW);
	}

	private static final String VIEW = "/WEB-INF/jsp/hello.jsp";
}
