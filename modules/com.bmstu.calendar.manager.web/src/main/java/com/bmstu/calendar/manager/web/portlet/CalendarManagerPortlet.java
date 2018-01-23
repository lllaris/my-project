package com.bmstu.calendar.manager.web.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.bmstu.calendar.manager.core.model.Calendar;
import com.bmstu.calendar.manager.core.service.CalendarLocalService;
import com.bmstu.calendar.manager.web.constants.CalendarManagerPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * 
 * Calendar manager portlet.
 * 
 * @author Salbieva
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=traccar",
		"com.liferay.portlet.instanceable=false", "javax.portlet.display-name=Calendar Manager",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CalendarManagerPortletKeys.CalendarManagerPortlet,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class CalendarManagerPortlet extends MVCPortlet {

	private CalendarLocalService calendarLocalService;

	/**
	 * 
	 * Adds calendar to data base.
	 * 
	 * @param request
	 *            - request. Can't be <code>null</code>.
	 * @param response
	 *            - response. Can't be <code>null</code>
	 * 
	 * @throws PortalException
	 */
	public void addCalendar(ActionRequest request, ActionResponse response) throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Calendar.class.getName(), request);

		String calendarName = ParamUtil.getString(request, "name");
		String calendarFile = ParamUtil.getString(request, "file");
		String calendarAttributes = ParamUtil.getString(request, "calendarAttributes");

		try {
			calendarLocalService.addCalendar(serviceContext.getUserId(), calendarName, calendarFile, calendarAttributes,
					serviceContext);
			SessionMessages.add(request, "Calendar Added");
		} catch (Exception e) {
			System.out.println(e);
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/add_calendar.jsp");
		}
	}

	/**
	 * 
	 * removes calendar from data base.
	 * 
	 * @param request
	 *            - request. Can't be <code>null</code>.
	 * @param response
	 *            - response. Can't be <code>null</code>
	 * 
	 * @throws PortalException
	 */
	public void deleteCalendar(ActionRequest request, ActionResponse response) throws PortalException {
		long calendarId = ParamUtil.getLong(request, "calendarId");
		calendarLocalService.deleteCalendar(calendarId);
	}

	/**
	 * 
	 * Binds calendar service.
	 * 
	 */
	@Reference(unbind = "-")
	protected void bindGeozoneService(CalendarLocalService geozoneLocalService) {
		this.calendarLocalService = geozoneLocalService;
	}

}