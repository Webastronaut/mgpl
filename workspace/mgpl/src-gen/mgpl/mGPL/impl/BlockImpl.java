/**
 * generated by Xtext 2.16.0
 */
package mgpl.mGPL.impl;

import mgpl.mGPL.Block;
import mgpl.mGPL.MGPLPackage;
import mgpl.mGPL.StmtBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgpl.mGPL.impl.BlockImpl#getStmtBlock <em>Stmt Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block
{
  /**
   * The cached value of the '{@link #getStmtBlock() <em>Stmt Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStmtBlock()
   * @generated
   * @ordered
   */
  protected StmtBlock stmtBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MGPLPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StmtBlock getStmtBlock()
  {
    return stmtBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStmtBlock(StmtBlock newStmtBlock, NotificationChain msgs)
  {
    StmtBlock oldStmtBlock = stmtBlock;
    stmtBlock = newStmtBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.BLOCK__STMT_BLOCK, oldStmtBlock, newStmtBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStmtBlock(StmtBlock newStmtBlock)
  {
    if (newStmtBlock != stmtBlock)
    {
      NotificationChain msgs = null;
      if (stmtBlock != null)
        msgs = ((InternalEObject)stmtBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.BLOCK__STMT_BLOCK, null, msgs);
      if (newStmtBlock != null)
        msgs = ((InternalEObject)newStmtBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.BLOCK__STMT_BLOCK, null, msgs);
      msgs = basicSetStmtBlock(newStmtBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.BLOCK__STMT_BLOCK, newStmtBlock, newStmtBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MGPLPackage.BLOCK__STMT_BLOCK:
        return basicSetStmtBlock(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MGPLPackage.BLOCK__STMT_BLOCK:
        return getStmtBlock();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MGPLPackage.BLOCK__STMT_BLOCK:
        setStmtBlock((StmtBlock)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.BLOCK__STMT_BLOCK:
        setStmtBlock((StmtBlock)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.BLOCK__STMT_BLOCK:
        return stmtBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //BlockImpl
