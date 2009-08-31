package AlarmIRPSystem;

/**
* AlarmIRPSystem/AlarmInformationIteratorHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/


/*
   The AlarmInformationIterator is used to iterate through a snapshot of
   Alarm Informations taken from the Alarm List when IRPManager invokes
   get_alarm_list. IRPManager uses it to pace the return of Alarm
   Informations.
   IRPAgent controls the life-cycle of the iterator. However, a destroy
   operation is provided to handle the case where IRPManager wants to stop
   the iteration procedure before reaching the last iteration.
   */
public final class AlarmInformationIteratorHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.AlarmInformationIterator value = null;

  public AlarmInformationIteratorHolder ()
  {
  }

  public AlarmInformationIteratorHolder (AlarmIRPSystem.AlarmInformationIterator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.AlarmInformationIteratorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.AlarmInformationIteratorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.AlarmInformationIteratorHelper.type ();
  }

}
