package action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public class BaseActionBean implements ActionBean {

	protected ActionBeanContext ctx;

	public ActionBeanContext getContext() {
		return ctx;
	}

	public void setContext(ActionBeanContext ctx) {
		this.ctx = ctx;
	}

}
