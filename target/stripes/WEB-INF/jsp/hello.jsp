<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>

<s:layout-render name="/WEB-INF/jsp/common/layout_main.jsp" title="My Title" >
	<s:layout-component name="body">
		<h3>Hello, Stripes!</h3>
		<p>
			Date and time: <br> <b> <fmt:formatDate type="both"
					dateStyle="full" value="${actionBean.date}" />
			</b>
		</p>
		<p>
			<s:link beanclass="action.HelloActionBean" event="currentDate">
	        Show the current date and time
	      </s:link>
			|
			<s:link beanclass="action.HelloActionBean" event="randomDate">
	        Show a random date and time
	      </s:link>
		</p>
	</s:layout-component>
</s:layout-render>