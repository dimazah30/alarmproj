package CosNaming;


/**
* CosNaming/NamingContextExtOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/


/**
 * The NamingContextExt Interface provides the extensions to the 
 * NamingContext Interface as proposed by the Interoperable
 * Naming Service Extension.
 */
public interface NamingContextExtOperations  extends CosNaming.NamingContextOperations
{

  /**
 * This operation accepts a Name and returns a stringified Name.
 *
 * @param n - Name (a sequence of NameComponents)
 * @raises InvalidName - if the Name is invalid.
 */
  String to_string (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.InvalidName;

  /**
 * This operation accepts a StringifiedName and returns a Name.
 *
 * @param n - a StringifiedName
 * @raises InvalidName - if the Name is invalid.
 */
  CosNaming.NameComponent[] to_name (String sn) throws CosNaming.NamingContextPackage.InvalidName;

  /**
 * This operation accepts a URL address component and a stringified
 * name and returns a URL string.
 *
 * @param n - a Stringified name.
 * @raises addr - URL address component.
 */
  String to_url (String addr, String sn) throws CosNaming.NamingContextExtPackage.InvalidAddress, CosNaming.NamingContextPackage.InvalidName;

  /**
 * This is a convenience operation that performs a resolve in the same
 * manner as NamingContext::resolve.
 *
 * @param n - a Stringified name.
 * @raises NotFound, CannotProceed, InvalidName
 */
  org.omg.CORBA.Object resolve_str (String n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName;
} // interface NamingContextExtOperations
