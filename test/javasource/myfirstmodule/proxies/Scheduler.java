// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Scheduler
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject schedulerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Scheduler";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		StartDate("StartDate"),
		EndDate("EndDate"),
		SchedulerId("SchedulerId"),
		VisibleStartDate("VisibleStartDate"),
		VisibleEndDate("VisibleEndDate"),
		VisibleStartDateTemp("VisibleStartDateTemp"),
		VisibleEndDateTemp("VisibleEndDateTemp"),
		ShowScheduler("ShowScheduler"),
		TimeNewEvent("TimeNewEvent"),
		UpdateDateData("UpdateDateData"),
		UpdateDateView("UpdateDateView"),
		EdgeMoved("EdgeMoved"),
		NewGroupId("NewGroupId"),
		CompleteRefresh("CompleteRefresh"),
		ItemIdChanged("ItemIdChanged"),
		ExpandAll("ExpandAll"),
		CollpaseAll("CollpaseAll"),
		ItemSelectedTitle("ItemSelectedTitle"),
		ItemSelectedSubTitle("ItemSelectedSubTitle"),
		CanMove("CanMove"),
		Multiselect("Multiselect"),
		NrItemsSelected("NrItemsSelected"),
		SelectedItems("SelectedItems"),
		SelectedItemsDetailed("SelectedItemsDetailed"),
		DeselectItems("DeselectItems"),
		ViewMinutes("ViewMinutes"),
		MaxMinutes("MaxMinutes"),
		StartDateToShow("StartDateToShow"),
		EndDateToShow("EndDateToShow"),
		GroupHoverTitle("GroupHoverTitle"),
		GroupHoverText("GroupHoverText"),
		CickedItemDetails("CickedItemDetails");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Scheduler(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Scheduler"));
	}

	protected Scheduler(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject schedulerMendixObject)
	{
		if (schedulerMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Scheduler", schedulerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Scheduler");

		this.schedulerMendixObject = schedulerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Scheduler.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Scheduler initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Scheduler.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Scheduler initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Scheduler(context, mendixObject);
	}

	public static myfirstmodule.proxies.Scheduler load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Scheduler.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * @return value of SchedulerId
	 */
	public final java.lang.String getSchedulerId()
	{
		return getSchedulerId(getContext());
	}

	/**
	 * @param context
	 * @return value of SchedulerId
	 */
	public final java.lang.String getSchedulerId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SchedulerId.toString());
	}

	/**
	 * Set value of SchedulerId
	 * @param schedulerid
	 */
	public final void setSchedulerId(java.lang.String schedulerid)
	{
		setSchedulerId(getContext(), schedulerid);
	}

	/**
	 * Set value of SchedulerId
	 * @param context
	 * @param schedulerid
	 */
	public final void setSchedulerId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String schedulerid)
	{
		getMendixObject().setValue(context, MemberNames.SchedulerId.toString(), schedulerid);
	}

	/**
	 * @return value of VisibleStartDate
	 */
	public final java.util.Date getVisibleStartDate()
	{
		return getVisibleStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of VisibleStartDate
	 */
	public final java.util.Date getVisibleStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.VisibleStartDate.toString());
	}

	/**
	 * Set value of VisibleStartDate
	 * @param visiblestartdate
	 */
	public final void setVisibleStartDate(java.util.Date visiblestartdate)
	{
		setVisibleStartDate(getContext(), visiblestartdate);
	}

	/**
	 * Set value of VisibleStartDate
	 * @param context
	 * @param visiblestartdate
	 */
	public final void setVisibleStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date visiblestartdate)
	{
		getMendixObject().setValue(context, MemberNames.VisibleStartDate.toString(), visiblestartdate);
	}

	/**
	 * @return value of VisibleEndDate
	 */
	public final java.util.Date getVisibleEndDate()
	{
		return getVisibleEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of VisibleEndDate
	 */
	public final java.util.Date getVisibleEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.VisibleEndDate.toString());
	}

	/**
	 * Set value of VisibleEndDate
	 * @param visibleenddate
	 */
	public final void setVisibleEndDate(java.util.Date visibleenddate)
	{
		setVisibleEndDate(getContext(), visibleenddate);
	}

	/**
	 * Set value of VisibleEndDate
	 * @param context
	 * @param visibleenddate
	 */
	public final void setVisibleEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date visibleenddate)
	{
		getMendixObject().setValue(context, MemberNames.VisibleEndDate.toString(), visibleenddate);
	}

	/**
	 * @return value of VisibleStartDateTemp
	 */
	public final java.util.Date getVisibleStartDateTemp()
	{
		return getVisibleStartDateTemp(getContext());
	}

	/**
	 * @param context
	 * @return value of VisibleStartDateTemp
	 */
	public final java.util.Date getVisibleStartDateTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.VisibleStartDateTemp.toString());
	}

	/**
	 * Set value of VisibleStartDateTemp
	 * @param visiblestartdatetemp
	 */
	public final void setVisibleStartDateTemp(java.util.Date visiblestartdatetemp)
	{
		setVisibleStartDateTemp(getContext(), visiblestartdatetemp);
	}

	/**
	 * Set value of VisibleStartDateTemp
	 * @param context
	 * @param visiblestartdatetemp
	 */
	public final void setVisibleStartDateTemp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date visiblestartdatetemp)
	{
		getMendixObject().setValue(context, MemberNames.VisibleStartDateTemp.toString(), visiblestartdatetemp);
	}

	/**
	 * @return value of VisibleEndDateTemp
	 */
	public final java.util.Date getVisibleEndDateTemp()
	{
		return getVisibleEndDateTemp(getContext());
	}

	/**
	 * @param context
	 * @return value of VisibleEndDateTemp
	 */
	public final java.util.Date getVisibleEndDateTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.VisibleEndDateTemp.toString());
	}

	/**
	 * Set value of VisibleEndDateTemp
	 * @param visibleenddatetemp
	 */
	public final void setVisibleEndDateTemp(java.util.Date visibleenddatetemp)
	{
		setVisibleEndDateTemp(getContext(), visibleenddatetemp);
	}

	/**
	 * Set value of VisibleEndDateTemp
	 * @param context
	 * @param visibleenddatetemp
	 */
	public final void setVisibleEndDateTemp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date visibleenddatetemp)
	{
		getMendixObject().setValue(context, MemberNames.VisibleEndDateTemp.toString(), visibleenddatetemp);
	}

	/**
	 * @return value of ShowScheduler
	 */
	public final java.lang.Boolean getShowScheduler()
	{
		return getShowScheduler(getContext());
	}

	/**
	 * @param context
	 * @return value of ShowScheduler
	 */
	public final java.lang.Boolean getShowScheduler(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ShowScheduler.toString());
	}

	/**
	 * Set value of ShowScheduler
	 * @param showscheduler
	 */
	public final void setShowScheduler(java.lang.Boolean showscheduler)
	{
		setShowScheduler(getContext(), showscheduler);
	}

	/**
	 * Set value of ShowScheduler
	 * @param context
	 * @param showscheduler
	 */
	public final void setShowScheduler(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean showscheduler)
	{
		getMendixObject().setValue(context, MemberNames.ShowScheduler.toString(), showscheduler);
	}

	/**
	 * @return value of TimeNewEvent
	 */
	public final java.util.Date getTimeNewEvent()
	{
		return getTimeNewEvent(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeNewEvent
	 */
	public final java.util.Date getTimeNewEvent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.TimeNewEvent.toString());
	}

	/**
	 * Set value of TimeNewEvent
	 * @param timenewevent
	 */
	public final void setTimeNewEvent(java.util.Date timenewevent)
	{
		setTimeNewEvent(getContext(), timenewevent);
	}

	/**
	 * Set value of TimeNewEvent
	 * @param context
	 * @param timenewevent
	 */
	public final void setTimeNewEvent(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timenewevent)
	{
		getMendixObject().setValue(context, MemberNames.TimeNewEvent.toString(), timenewevent);
	}

	/**
	 * @return value of UpdateDateData
	 */
	public final java.util.Date getUpdateDateData()
	{
		return getUpdateDateData(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateDateData
	 */
	public final java.util.Date getUpdateDateData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.UpdateDateData.toString());
	}

	/**
	 * Set value of UpdateDateData
	 * @param updatedatedata
	 */
	public final void setUpdateDateData(java.util.Date updatedatedata)
	{
		setUpdateDateData(getContext(), updatedatedata);
	}

	/**
	 * Set value of UpdateDateData
	 * @param context
	 * @param updatedatedata
	 */
	public final void setUpdateDateData(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date updatedatedata)
	{
		getMendixObject().setValue(context, MemberNames.UpdateDateData.toString(), updatedatedata);
	}

	/**
	 * @return value of UpdateDateView
	 */
	public final java.util.Date getUpdateDateView()
	{
		return getUpdateDateView(getContext());
	}

	/**
	 * @param context
	 * @return value of UpdateDateView
	 */
	public final java.util.Date getUpdateDateView(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.UpdateDateView.toString());
	}

	/**
	 * Set value of UpdateDateView
	 * @param updatedateview
	 */
	public final void setUpdateDateView(java.util.Date updatedateview)
	{
		setUpdateDateView(getContext(), updatedateview);
	}

	/**
	 * Set value of UpdateDateView
	 * @param context
	 * @param updatedateview
	 */
	public final void setUpdateDateView(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date updatedateview)
	{
		getMendixObject().setValue(context, MemberNames.UpdateDateView.toString(), updatedateview);
	}

	/**
	 * @return value of EdgeMoved
	 */
	public final java.lang.String getEdgeMoved()
	{
		return getEdgeMoved(getContext());
	}

	/**
	 * @param context
	 * @return value of EdgeMoved
	 */
	public final java.lang.String getEdgeMoved(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EdgeMoved.toString());
	}

	/**
	 * Set value of EdgeMoved
	 * @param edgemoved
	 */
	public final void setEdgeMoved(java.lang.String edgemoved)
	{
		setEdgeMoved(getContext(), edgemoved);
	}

	/**
	 * Set value of EdgeMoved
	 * @param context
	 * @param edgemoved
	 */
	public final void setEdgeMoved(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String edgemoved)
	{
		getMendixObject().setValue(context, MemberNames.EdgeMoved.toString(), edgemoved);
	}

	/**
	 * @return value of NewGroupId
	 */
	public final java.lang.String getNewGroupId()
	{
		return getNewGroupId(getContext());
	}

	/**
	 * @param context
	 * @return value of NewGroupId
	 */
	public final java.lang.String getNewGroupId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NewGroupId.toString());
	}

	/**
	 * Set value of NewGroupId
	 * @param newgroupid
	 */
	public final void setNewGroupId(java.lang.String newgroupid)
	{
		setNewGroupId(getContext(), newgroupid);
	}

	/**
	 * Set value of NewGroupId
	 * @param context
	 * @param newgroupid
	 */
	public final void setNewGroupId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String newgroupid)
	{
		getMendixObject().setValue(context, MemberNames.NewGroupId.toString(), newgroupid);
	}

	/**
	 * @return value of CompleteRefresh
	 */
	public final java.lang.Boolean getCompleteRefresh()
	{
		return getCompleteRefresh(getContext());
	}

	/**
	 * @param context
	 * @return value of CompleteRefresh
	 */
	public final java.lang.Boolean getCompleteRefresh(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CompleteRefresh.toString());
	}

	/**
	 * Set value of CompleteRefresh
	 * @param completerefresh
	 */
	public final void setCompleteRefresh(java.lang.Boolean completerefresh)
	{
		setCompleteRefresh(getContext(), completerefresh);
	}

	/**
	 * Set value of CompleteRefresh
	 * @param context
	 * @param completerefresh
	 */
	public final void setCompleteRefresh(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean completerefresh)
	{
		getMendixObject().setValue(context, MemberNames.CompleteRefresh.toString(), completerefresh);
	}

	/**
	 * @return value of ItemIdChanged
	 */
	public final java.lang.String getItemIdChanged()
	{
		return getItemIdChanged(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemIdChanged
	 */
	public final java.lang.String getItemIdChanged(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemIdChanged.toString());
	}

	/**
	 * Set value of ItemIdChanged
	 * @param itemidchanged
	 */
	public final void setItemIdChanged(java.lang.String itemidchanged)
	{
		setItemIdChanged(getContext(), itemidchanged);
	}

	/**
	 * Set value of ItemIdChanged
	 * @param context
	 * @param itemidchanged
	 */
	public final void setItemIdChanged(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemidchanged)
	{
		getMendixObject().setValue(context, MemberNames.ItemIdChanged.toString(), itemidchanged);
	}

	/**
	 * @return value of ExpandAll
	 */
	public final java.lang.Boolean getExpandAll()
	{
		return getExpandAll(getContext());
	}

	/**
	 * @param context
	 * @return value of ExpandAll
	 */
	public final java.lang.Boolean getExpandAll(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ExpandAll.toString());
	}

	/**
	 * Set value of ExpandAll
	 * @param expandall
	 */
	public final void setExpandAll(java.lang.Boolean expandall)
	{
		setExpandAll(getContext(), expandall);
	}

	/**
	 * Set value of ExpandAll
	 * @param context
	 * @param expandall
	 */
	public final void setExpandAll(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean expandall)
	{
		getMendixObject().setValue(context, MemberNames.ExpandAll.toString(), expandall);
	}

	/**
	 * @return value of CollpaseAll
	 */
	public final java.lang.Boolean getCollpaseAll()
	{
		return getCollpaseAll(getContext());
	}

	/**
	 * @param context
	 * @return value of CollpaseAll
	 */
	public final java.lang.Boolean getCollpaseAll(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CollpaseAll.toString());
	}

	/**
	 * Set value of CollpaseAll
	 * @param collpaseall
	 */
	public final void setCollpaseAll(java.lang.Boolean collpaseall)
	{
		setCollpaseAll(getContext(), collpaseall);
	}

	/**
	 * Set value of CollpaseAll
	 * @param context
	 * @param collpaseall
	 */
	public final void setCollpaseAll(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean collpaseall)
	{
		getMendixObject().setValue(context, MemberNames.CollpaseAll.toString(), collpaseall);
	}

	/**
	 * @return value of ItemSelectedTitle
	 */
	public final java.lang.String getItemSelectedTitle()
	{
		return getItemSelectedTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemSelectedTitle
	 */
	public final java.lang.String getItemSelectedTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemSelectedTitle.toString());
	}

	/**
	 * Set value of ItemSelectedTitle
	 * @param itemselectedtitle
	 */
	public final void setItemSelectedTitle(java.lang.String itemselectedtitle)
	{
		setItemSelectedTitle(getContext(), itemselectedtitle);
	}

	/**
	 * Set value of ItemSelectedTitle
	 * @param context
	 * @param itemselectedtitle
	 */
	public final void setItemSelectedTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemselectedtitle)
	{
		getMendixObject().setValue(context, MemberNames.ItemSelectedTitle.toString(), itemselectedtitle);
	}

	/**
	 * @return value of ItemSelectedSubTitle
	 */
	public final java.lang.String getItemSelectedSubTitle()
	{
		return getItemSelectedSubTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of ItemSelectedSubTitle
	 */
	public final java.lang.String getItemSelectedSubTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ItemSelectedSubTitle.toString());
	}

	/**
	 * Set value of ItemSelectedSubTitle
	 * @param itemselectedsubtitle
	 */
	public final void setItemSelectedSubTitle(java.lang.String itemselectedsubtitle)
	{
		setItemSelectedSubTitle(getContext(), itemselectedsubtitle);
	}

	/**
	 * Set value of ItemSelectedSubTitle
	 * @param context
	 * @param itemselectedsubtitle
	 */
	public final void setItemSelectedSubTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String itemselectedsubtitle)
	{
		getMendixObject().setValue(context, MemberNames.ItemSelectedSubTitle.toString(), itemselectedsubtitle);
	}

	/**
	 * @return value of CanMove
	 */
	public final java.lang.Boolean getCanMove()
	{
		return getCanMove(getContext());
	}

	/**
	 * @param context
	 * @return value of CanMove
	 */
	public final java.lang.Boolean getCanMove(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.CanMove.toString());
	}

	/**
	 * Set value of CanMove
	 * @param canmove
	 */
	public final void setCanMove(java.lang.Boolean canmove)
	{
		setCanMove(getContext(), canmove);
	}

	/**
	 * Set value of CanMove
	 * @param context
	 * @param canmove
	 */
	public final void setCanMove(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean canmove)
	{
		getMendixObject().setValue(context, MemberNames.CanMove.toString(), canmove);
	}

	/**
	 * @return value of Multiselect
	 */
	public final java.lang.Boolean getMultiselect()
	{
		return getMultiselect(getContext());
	}

	/**
	 * @param context
	 * @return value of Multiselect
	 */
	public final java.lang.Boolean getMultiselect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Multiselect.toString());
	}

	/**
	 * Set value of Multiselect
	 * @param multiselect
	 */
	public final void setMultiselect(java.lang.Boolean multiselect)
	{
		setMultiselect(getContext(), multiselect);
	}

	/**
	 * Set value of Multiselect
	 * @param context
	 * @param multiselect
	 */
	public final void setMultiselect(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean multiselect)
	{
		getMendixObject().setValue(context, MemberNames.Multiselect.toString(), multiselect);
	}

	/**
	 * @return value of NrItemsSelected
	 */
	public final java.lang.String getNrItemsSelected()
	{
		return getNrItemsSelected(getContext());
	}

	/**
	 * @param context
	 * @return value of NrItemsSelected
	 */
	public final java.lang.String getNrItemsSelected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NrItemsSelected.toString());
	}

	/**
	 * Set value of NrItemsSelected
	 * @param nritemsselected
	 */
	public final void setNrItemsSelected(java.lang.String nritemsselected)
	{
		setNrItemsSelected(getContext(), nritemsselected);
	}

	/**
	 * Set value of NrItemsSelected
	 * @param context
	 * @param nritemsselected
	 */
	public final void setNrItemsSelected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nritemsselected)
	{
		getMendixObject().setValue(context, MemberNames.NrItemsSelected.toString(), nritemsselected);
	}

	/**
	 * @return value of SelectedItems
	 */
	public final java.lang.String getSelectedItems()
	{
		return getSelectedItems(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectedItems
	 */
	public final java.lang.String getSelectedItems(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SelectedItems.toString());
	}

	/**
	 * Set value of SelectedItems
	 * @param selecteditems
	 */
	public final void setSelectedItems(java.lang.String selecteditems)
	{
		setSelectedItems(getContext(), selecteditems);
	}

	/**
	 * Set value of SelectedItems
	 * @param context
	 * @param selecteditems
	 */
	public final void setSelectedItems(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String selecteditems)
	{
		getMendixObject().setValue(context, MemberNames.SelectedItems.toString(), selecteditems);
	}

	/**
	 * @return value of SelectedItemsDetailed
	 */
	public final java.lang.String getSelectedItemsDetailed()
	{
		return getSelectedItemsDetailed(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectedItemsDetailed
	 */
	public final java.lang.String getSelectedItemsDetailed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SelectedItemsDetailed.toString());
	}

	/**
	 * Set value of SelectedItemsDetailed
	 * @param selecteditemsdetailed
	 */
	public final void setSelectedItemsDetailed(java.lang.String selecteditemsdetailed)
	{
		setSelectedItemsDetailed(getContext(), selecteditemsdetailed);
	}

	/**
	 * Set value of SelectedItemsDetailed
	 * @param context
	 * @param selecteditemsdetailed
	 */
	public final void setSelectedItemsDetailed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String selecteditemsdetailed)
	{
		getMendixObject().setValue(context, MemberNames.SelectedItemsDetailed.toString(), selecteditemsdetailed);
	}

	/**
	 * @return value of DeselectItems
	 */
	public final java.lang.Boolean getDeselectItems()
	{
		return getDeselectItems(getContext());
	}

	/**
	 * @param context
	 * @return value of DeselectItems
	 */
	public final java.lang.Boolean getDeselectItems(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DeselectItems.toString());
	}

	/**
	 * Set value of DeselectItems
	 * @param deselectitems
	 */
	public final void setDeselectItems(java.lang.Boolean deselectitems)
	{
		setDeselectItems(getContext(), deselectitems);
	}

	/**
	 * Set value of DeselectItems
	 * @param context
	 * @param deselectitems
	 */
	public final void setDeselectItems(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean deselectitems)
	{
		getMendixObject().setValue(context, MemberNames.DeselectItems.toString(), deselectitems);
	}

	/**
	 * @return value of ViewMinutes
	 */
	public final java.lang.Long getViewMinutes()
	{
		return getViewMinutes(getContext());
	}

	/**
	 * @param context
	 * @return value of ViewMinutes
	 */
	public final java.lang.Long getViewMinutes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ViewMinutes.toString());
	}

	/**
	 * Set value of ViewMinutes
	 * @param viewminutes
	 */
	public final void setViewMinutes(java.lang.Long viewminutes)
	{
		setViewMinutes(getContext(), viewminutes);
	}

	/**
	 * Set value of ViewMinutes
	 * @param context
	 * @param viewminutes
	 */
	public final void setViewMinutes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long viewminutes)
	{
		getMendixObject().setValue(context, MemberNames.ViewMinutes.toString(), viewminutes);
	}

	/**
	 * @return value of MaxMinutes
	 */
	public final java.lang.Long getMaxMinutes()
	{
		return getMaxMinutes(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxMinutes
	 */
	public final java.lang.Long getMaxMinutes(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MaxMinutes.toString());
	}

	/**
	 * Set value of MaxMinutes
	 * @param maxminutes
	 */
	public final void setMaxMinutes(java.lang.Long maxminutes)
	{
		setMaxMinutes(getContext(), maxminutes);
	}

	/**
	 * Set value of MaxMinutes
	 * @param context
	 * @param maxminutes
	 */
	public final void setMaxMinutes(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long maxminutes)
	{
		getMendixObject().setValue(context, MemberNames.MaxMinutes.toString(), maxminutes);
	}

	/**
	 * @return value of StartDateToShow
	 */
	public final java.util.Date getStartDateToShow()
	{
		return getStartDateToShow(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDateToShow
	 */
	public final java.util.Date getStartDateToShow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDateToShow.toString());
	}

	/**
	 * Set value of StartDateToShow
	 * @param startdatetoshow
	 */
	public final void setStartDateToShow(java.util.Date startdatetoshow)
	{
		setStartDateToShow(getContext(), startdatetoshow);
	}

	/**
	 * Set value of StartDateToShow
	 * @param context
	 * @param startdatetoshow
	 */
	public final void setStartDateToShow(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdatetoshow)
	{
		getMendixObject().setValue(context, MemberNames.StartDateToShow.toString(), startdatetoshow);
	}

	/**
	 * @return value of EndDateToShow
	 */
	public final java.util.Date getEndDateToShow()
	{
		return getEndDateToShow(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDateToShow
	 */
	public final java.util.Date getEndDateToShow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDateToShow.toString());
	}

	/**
	 * Set value of EndDateToShow
	 * @param enddatetoshow
	 */
	public final void setEndDateToShow(java.util.Date enddatetoshow)
	{
		setEndDateToShow(getContext(), enddatetoshow);
	}

	/**
	 * Set value of EndDateToShow
	 * @param context
	 * @param enddatetoshow
	 */
	public final void setEndDateToShow(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddatetoshow)
	{
		getMendixObject().setValue(context, MemberNames.EndDateToShow.toString(), enddatetoshow);
	}

	/**
	 * @return value of GroupHoverTitle
	 */
	public final java.lang.String getGroupHoverTitle()
	{
		return getGroupHoverTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of GroupHoverTitle
	 */
	public final java.lang.String getGroupHoverTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.GroupHoverTitle.toString());
	}

	/**
	 * Set value of GroupHoverTitle
	 * @param grouphovertitle
	 */
	public final void setGroupHoverTitle(java.lang.String grouphovertitle)
	{
		setGroupHoverTitle(getContext(), grouphovertitle);
	}

	/**
	 * Set value of GroupHoverTitle
	 * @param context
	 * @param grouphovertitle
	 */
	public final void setGroupHoverTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String grouphovertitle)
	{
		getMendixObject().setValue(context, MemberNames.GroupHoverTitle.toString(), grouphovertitle);
	}

	/**
	 * @return value of GroupHoverText
	 */
	public final java.lang.String getGroupHoverText()
	{
		return getGroupHoverText(getContext());
	}

	/**
	 * @param context
	 * @return value of GroupHoverText
	 */
	public final java.lang.String getGroupHoverText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.GroupHoverText.toString());
	}

	/**
	 * Set value of GroupHoverText
	 * @param grouphovertext
	 */
	public final void setGroupHoverText(java.lang.String grouphovertext)
	{
		setGroupHoverText(getContext(), grouphovertext);
	}

	/**
	 * Set value of GroupHoverText
	 * @param context
	 * @param grouphovertext
	 */
	public final void setGroupHoverText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String grouphovertext)
	{
		getMendixObject().setValue(context, MemberNames.GroupHoverText.toString(), grouphovertext);
	}

	/**
	 * @return value of CickedItemDetails
	 */
	public final java.lang.String getCickedItemDetails()
	{
		return getCickedItemDetails(getContext());
	}

	/**
	 * @param context
	 * @return value of CickedItemDetails
	 */
	public final java.lang.String getCickedItemDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CickedItemDetails.toString());
	}

	/**
	 * Set value of CickedItemDetails
	 * @param cickeditemdetails
	 */
	public final void setCickedItemDetails(java.lang.String cickeditemdetails)
	{
		setCickedItemDetails(getContext(), cickeditemdetails);
	}

	/**
	 * Set value of CickedItemDetails
	 * @param context
	 * @param cickeditemdetails
	 */
	public final void setCickedItemDetails(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String cickeditemdetails)
	{
		getMendixObject().setValue(context, MemberNames.CickedItemDetails.toString(), cickeditemdetails);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return schedulerMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Scheduler that = (myfirstmodule.proxies.Scheduler) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Scheduler";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
