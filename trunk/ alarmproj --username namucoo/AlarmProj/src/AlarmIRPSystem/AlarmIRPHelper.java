package AlarmIRPSystem;


/**
* AlarmIRPSystem/AlarmIRPHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

abstract public class AlarmIRPHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPSystem/AlarmIRP:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPSystem.AlarmIRP that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPSystem.AlarmIRP extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AlarmIRPSystem.AlarmIRPHelper.id (), "AlarmIRP");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPSystem.AlarmIRP read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AlarmIRPStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPSystem.AlarmIRP value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AlarmIRPSystem.AlarmIRP narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPSystem.AlarmIRP)
      return (AlarmIRPSystem.AlarmIRP)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPSystem._AlarmIRPStub stub = new AlarmIRPSystem._AlarmIRPStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AlarmIRPSystem.AlarmIRP unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPSystem.AlarmIRP)
      return (AlarmIRPSystem.AlarmIRP)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPSystem._AlarmIRPStub stub = new AlarmIRPSystem._AlarmIRPStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
