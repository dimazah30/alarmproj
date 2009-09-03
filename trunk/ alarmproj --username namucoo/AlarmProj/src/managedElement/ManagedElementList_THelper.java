package managedElement;


/**
* managedElement/ManagedElementList_THelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� managedElement.idl
* 2009��9��2�� ������ ����03ʱ27��41�� CST
*/


/**
   * <p>Sequence of ManagedElement_T.</p>
   **/
abstract public class ManagedElementList_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/managedElement/ManagedElementList_T:1.0";

  public static void insert (org.omg.CORBA.Any a, managedElement.ManagedElement_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static managedElement.ManagedElement_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = managedElement.ManagedElement_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (managedElement.ManagedElementList_THelper.id (), "ManagedElementList_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static managedElement.ManagedElement_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    managedElement.ManagedElement_T value[] = null;
    int _len0 = istream.read_long ();
    value = new managedElement.ManagedElement_T[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = managedElement.ManagedElement_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, managedElement.ManagedElement_T[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      managedElement.ManagedElement_THelper.write (ostream, value[_i0]);
  }

}