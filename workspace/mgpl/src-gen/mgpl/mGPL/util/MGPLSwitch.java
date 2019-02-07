/**
 * generated by Xtext 2.16.0
 */
package mgpl.mGPL.util;

import mgpl.mGPL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mgpl.mGPL.MGPLPackage
 * @generated
 */
public class MGPLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MGPLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MGPLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MGPLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MGPLPackage.PROG:
      {
        Prog prog = (Prog)theEObject;
        T result = caseProg(prog);
        if (result == null) result = caseAllDecls(prog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.DECL:
      {
        Decl decl = (Decl)theEObject;
        T result = caseDecl(decl);
        if (result == null) result = caseAllDecls(decl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.VAR_DECL:
      {
        VarDecl varDecl = (VarDecl)theEObject;
        T result = caseVarDecl(varDecl);
        if (result == null) result = caseDecl(varDecl);
        if (result == null) result = caseAllDecls(varDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.INIT:
      {
        Init init = (Init)theEObject;
        T result = caseInit(init);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.OBJ_DECL:
      {
        ObjDecl objDecl = (ObjDecl)theEObject;
        T result = caseObjDecl(objDecl);
        if (result == null) result = caseDecl(objDecl);
        if (result == null) result = caseAllDecls(objDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.ATTR_ASS:
      {
        AttrAss attrAss = (AttrAss)theEObject;
        T result = caseAttrAss(attrAss);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.ANIM_BLOCK:
      {
        AnimBlock animBlock = (AnimBlock)theEObject;
        T result = caseAnimBlock(animBlock);
        if (result == null) result = caseBlock(animBlock);
        if (result == null) result = caseAllDecls(animBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.PARAM_DECL:
      {
        ParamDecl paramDecl = (ParamDecl)theEObject;
        T result = caseParamDecl(paramDecl);
        if (result == null) result = caseAllDecls(paramDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.EVENT_BLOCK:
      {
        EventBlock eventBlock = (EventBlock)theEObject;
        T result = caseEventBlock(eventBlock);
        if (result == null) result = caseBlock(eventBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.STMT_BLOCK:
      {
        StmtBlock stmtBlock = (StmtBlock)theEObject;
        T result = caseStmtBlock(stmtBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.STMT:
      {
        Stmt stmt = (Stmt)theEObject;
        T result = caseStmt(stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.IF_STMT:
      {
        IfStmt ifStmt = (IfStmt)theEObject;
        T result = caseIfStmt(ifStmt);
        if (result == null) result = caseStmt(ifStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.FOR_STMT:
      {
        ForStmt forStmt = (ForStmt)theEObject;
        T result = caseForStmt(forStmt);
        if (result == null) result = caseStmt(forStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.ASS_STMT:
      {
        AssStmt assStmt = (AssStmt)theEObject;
        T result = caseAssStmt(assStmt);
        if (result == null) result = caseStmt(assStmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.ALL_DECLS:
      {
        AllDecls allDecls = (AllDecls)theEObject;
        T result = caseAllDecls(allDecls);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.VAR:
      {
        Var var = (Var)theEObject;
        T result = caseVar(var);
        if (result == null) result = caseExpr(var);
        if (result == null) result = caseInit(var);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = caseInit(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.ARRAY_DECL:
      {
        ArrayDecl arrayDecl = (ArrayDecl)theEObject;
        T result = caseArrayDecl(arrayDecl);
        if (result == null) result = caseVarDecl(arrayDecl);
        if (result == null) result = caseObjDecl(arrayDecl);
        if (result == null) result = caseDecl(arrayDecl);
        if (result == null) result = caseAllDecls(arrayDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.ELEMENT_SELECT:
      {
        ElementSelect elementSelect = (ElementSelect)theEObject;
        T result = caseElementSelect(elementSelect);
        if (result == null) result = caseVar(elementSelect);
        if (result == null) result = caseExpr(elementSelect);
        if (result == null) result = caseInit(elementSelect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.MEMBER_SELECT:
      {
        MemberSelect memberSelect = (MemberSelect)theEObject;
        T result = caseMemberSelect(memberSelect);
        if (result == null) result = caseVar(memberSelect);
        if (result == null) result = caseExpr(memberSelect);
        if (result == null) result = caseInit(memberSelect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseExpr(or);
        if (result == null) result = caseInit(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseExpr(and);
        if (result == null) result = caseInit(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.EQUALS:
      {
        Equals equals = (Equals)theEObject;
        T result = caseEquals(equals);
        if (result == null) result = caseExpr(equals);
        if (result == null) result = caseInit(equals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.LESS:
      {
        Less less = (Less)theEObject;
        T result = caseLess(less);
        if (result == null) result = caseExpr(less);
        if (result == null) result = caseInit(less);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.LESS_OR_EQUALS:
      {
        LessOrEquals lessOrEquals = (LessOrEquals)theEObject;
        T result = caseLessOrEquals(lessOrEquals);
        if (result == null) result = caseExpr(lessOrEquals);
        if (result == null) result = caseInit(lessOrEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpr(plus);
        if (result == null) result = caseInit(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpr(minus);
        if (result == null) result = caseInit(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.DIVIDE:
      {
        Divide divide = (Divide)theEObject;
        T result = caseDivide(divide);
        if (result == null) result = caseExpr(divide);
        if (result == null) result = caseInit(divide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.TIMES:
      {
        Times times = (Times)theEObject;
        T result = caseTimes(times);
        if (result == null) result = caseExpr(times);
        if (result == null) result = caseInit(times);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.NEGATION:
      {
        Negation negation = (Negation)theEObject;
        T result = caseNegation(negation);
        if (result == null) result = caseExpr(negation);
        if (result == null) result = caseInit(negation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.COMPLEMENT:
      {
        Complement complement = (Complement)theEObject;
        T result = caseComplement(complement);
        if (result == null) result = caseExpr(complement);
        if (result == null) result = caseInit(complement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpr(numberLiteral);
        if (result == null) result = caseInit(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MGPLPackage.TOUCHES:
      {
        Touches touches = (Touches)theEObject;
        T result = caseTouches(touches);
        if (result == null) result = caseExpr(touches);
        if (result == null) result = caseInit(touches);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProg(Prog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecl(Decl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDecl(VarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInit(Init object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Obj Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obj Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjDecl(ObjDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attr Ass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attr Ass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttrAss(AttrAss object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anim Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anim Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnimBlock(AnimBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Param Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Param Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParamDecl(ParamDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventBlock(EventBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmtBlock(StmtBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStmt(Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStmt(IfStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStmt(ForStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ass Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ass Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssStmt(AssStmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Decls</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Decls</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllDecls(AllDecls object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVar(Var object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayDecl(ArrayDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementSelect(ElementSelect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberSelect(MemberSelect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquals(Equals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLess(Less object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less Or Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less Or Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLessOrEquals(LessOrEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivide(Divide object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Times</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Times</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimes(Times object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegation(Negation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplement(Complement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Touches</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Touches</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTouches(Touches object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MGPLSwitch
