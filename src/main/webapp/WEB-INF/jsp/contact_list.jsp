<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>
<s:layout-render name="/WEB-INF/jsp/common/layout_main.jsp"
	title="List Contact">
	<s:layout-component name="body">
	
		<s:messages />

		<s:link beanclass="action.ContactFormActionBean">
			Create a New Contact
		</s:link>

		<d:table name="${actionBean.contacts}" id="contact" requestURI=""
			defaultsort="1">
			<d:column title="Last name" property="lastName" sortable="true" />
			<d:column title="First name" property="firstName" sortable="true" />
			<d:column title="Email" property="email" sortable="true" />
			<d:column title="Action">
				<s:link beanclass="action.ContactListActionBean" event="view">
					<s:param name="contactId" value="${contact.id}" />View
				</s:link> |
				<s:link beanclass="action.ContactListActionBean" event="delete"
					onclick="return confirm('Delete ${contact.firstName}?');">
					<s:param name="contactId" value="${contact.id}" />Delete
				</s:link> |
				<s:link beanclass="action.ContactFormActionBean">
					<s:param name="contactId" value="${contact.id}" />Update
				</s:link>
			</d:column>
		</d:table>
	</s:layout-component>
</s:layout-render>