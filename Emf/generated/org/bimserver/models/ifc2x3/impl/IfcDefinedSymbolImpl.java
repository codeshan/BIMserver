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
import org.bimserver.models.ifc2x3.IfcCartesianTransformationOperator2D;
import org.bimserver.models.ifc2x3.IfcDefinedSymbol;
import org.bimserver.models.ifc2x3.IfcDefinedSymbolSelect;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Defined Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDefinedSymbolImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcDefinedSymbolImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDefinedSymbolImpl extends IfcGeometricRepresentationItemImpl implements IfcDefinedSymbol {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDefinedSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcDefinedSymbol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDefinedSymbolSelect getDefinition() {
		return (IfcDefinedSymbolSelect) eGet(Ifc2x3Package.eINSTANCE.getIfcDefinedSymbol_Definition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(IfcDefinedSymbolSelect newDefinition) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDefinedSymbol_Definition(), newDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator2D getTarget() {
		return (IfcCartesianTransformationOperator2D) eGet(Ifc2x3Package.eINSTANCE.getIfcDefinedSymbol_Target(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IfcCartesianTransformationOperator2D newTarget) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcDefinedSymbol_Target(), newTarget);
	}

} //IfcDefinedSymbolImpl
