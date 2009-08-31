package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationSeqHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

abstract public class AlarmInformationSeqHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPConstDefs/AlarmInformationSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.StructuredEvent[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.StructuredEvent[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = CosNotification.StructuredEventHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (CosNotification.EventBatchHelper.id (), "EventBatch", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (AlarmIRPConstDefs.AlarmInformationSeqHelper.id (), "AlarmInformationSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.StructuredEvent[] read (org.omg.CORBA.portable.InputStream istream)
  {
    CosNotification.StructuredEvent value[] = null;
    value = CosNotification.EventBatchHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.StructuredEvent[] value)
  {
    CosNotification.EventBatchHelper.write (ostream, value);
  }

}
