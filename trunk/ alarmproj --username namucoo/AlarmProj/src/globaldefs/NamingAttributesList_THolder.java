package globaldefs;


/**
* globaldefs/NamingAttributesList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� globaldefs.idl
* 2009��9��2�� ������ ����02ʱ43��56�� CST
*/


/**
   * <p>A list of NamingAttributes_T. It is a list of lists.</p>
   **/
public final class NamingAttributesList_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NameAndStringValue_T value[][] = null;

  public NamingAttributesList_THolder ()
  {
  }

  public NamingAttributesList_THolder (globaldefs.NameAndStringValue_T[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.NamingAttributesList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.NamingAttributesList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.NamingAttributesList_THelper.type ();
  }

}
