package common;


/**
* common/CapabilityList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� common.idl
* 2009��9��2�� ������ ����12ʱ53��05�� CST
*/


/**
   * Set of Capability_T.  Used to represent the full set of capabilities of a 
   * manager. Any capability that is not listed is considered unsupported.
   */
public final class CapabilityList_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NameAndStringValue_T value[] = null;

  public CapabilityList_THolder ()
  {
  }

  public CapabilityList_THolder (globaldefs.NameAndStringValue_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = common.CapabilityList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    common.CapabilityList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return common.CapabilityList_THelper.type ();
  }

}
