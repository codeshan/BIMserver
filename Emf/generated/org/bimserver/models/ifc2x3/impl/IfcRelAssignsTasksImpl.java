/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcRelAssignsTasks;
import org.bimserver.models.ifc2x3.IfcScheduleTimeControl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns Tasks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcRelAssignsTasksImpl#getTimeForTask <em>Time For Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsTasksImpl extends IfcRelAssignsToControlImpl implements IfcRelAssignsTasks {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsTasksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcRelAssignsTasks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcScheduleTimeControl getTimeForTask() {
		return (IfcScheduleTimeControl) eGet(Ifc2x3Package.eINSTANCE.getIfcRelAssignsTasks_TimeForTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForTask(IfcScheduleTimeControl newTimeForTask) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcRelAssignsTasks_TimeForTask(), newTimeForTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeForTask() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcRelAssignsTasks_TimeForTask());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeForTask() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcRelAssignsTasks_TimeForTask());
	}

} //IfcRelAssignsTasksImpl
