package common;

/**
* common/Common_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� common.idl
* 2009��9��2�� ������ ����12ʱ53��06�� CST
*/


/**
   * <p>The interface Common_I is a set of services and utilities 
   * that is inherited by every manager interface.<p>
   **/
public final class Common_IHolder implements org.omg.CORBA.portable.Streamable
{
  public common.Common_I value = null;

  public Common_IHolder ()
  {
  }

  public Common_IHolder (common.Common_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = common.Common_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    common.Common_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return common.Common_IHelper.type ();
  }

}
