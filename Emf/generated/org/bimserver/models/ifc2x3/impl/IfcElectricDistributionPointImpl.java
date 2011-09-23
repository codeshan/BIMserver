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
import org.bimserver.models.ifc2x3.IfcElectricDistributionPoint;
import org.bimserver.models.ifc2x3.IfcElectricDistributionPointFunctionEnum;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electric Distribution Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcElectricDistributionPointImpl#getDistributionPointFunction <em>Distribution Point Function</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcElectricDistributionPointImpl#getUserDefinedFunction <em>User Defined Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElectricDistributionPointImpl extends IfcFlowControllerImpl implements IfcElectricDistributionPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricDistributionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcElectricDistributionPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricDistributionPointFunctionEnum getDistributionPointFunction() {
		return (IfcElectricDistributionPointFunctionEnum) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricDistributionPoint_DistributionPointFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum newDistributionPointFunction) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricDistributionPoint_DistributionPointFunction(), newDistributionPointFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedFunction() {
		return (String) eGet(Ifc2x3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedFunction(String newUserDefinedFunction) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction(), newUserDefinedFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedFunction() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedFunction() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcElectricDistributionPoint_UserDefinedFunction());
	}

} //IfcElectricDistributionPointImpl
