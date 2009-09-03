package CosNaming;

/**
* CosNaming/NamingContextHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/


/**
 * The NamingContext interface provides operations which support the following:
 * <ul>
 * <li> binding objects
 * <li> name resolution
 * <li> unbinding
 * <li> creating naming contexts
 * <li> deleting contexts
 * <li> listing a naming context
 * </ul>
 */
public final class NamingContextHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContext value = null;

  public NamingContextHolder ()
  {
  }

  public NamingContextHolder (CosNaming.NamingContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextHelper.type ();
  }

}
