package notifications;


/**
* notifications/AlarmOrTCAIdentifier_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/

public final class AlarmOrTCAIdentifier_T implements org.omg.CORBA.portable.IDLEntity
{
  private notifications.AlarmId_T ___alarmId;
  private notifications.TCAId_T ___tcaId;
  private notifications.AlarmTypeQualifier_T __discriminator;
  private boolean __uninitialized = true;

  public AlarmOrTCAIdentifier_T ()
  {
  }

  public notifications.AlarmTypeQualifier_T discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public notifications.AlarmId_T alarmId ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyalarmId (__discriminator);
    return ___alarmId;
  }

  public void alarmId (notifications.AlarmId_T value)
  {
    __discriminator = notifications.AlarmTypeQualifier_T.ALARM;
    ___alarmId = value;
    __uninitialized = false;
  }

  public void alarmId (notifications.AlarmTypeQualifier_T discriminator, notifications.AlarmId_T value)
  {
    verifyalarmId (discriminator);
    __discriminator = discriminator;
    ___alarmId = value;
    __uninitialized = false;
  }

  private void verifyalarmId (notifications.AlarmTypeQualifier_T discriminator)
  {
    if (discriminator != notifications.AlarmTypeQualifier_T.ALARM)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public notifications.TCAId_T tcaId ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifytcaId (__discriminator);
    return ___tcaId;
  }

  public void tcaId (notifications.TCAId_T value)
  {
    __discriminator = notifications.AlarmTypeQualifier_T.TCA;
    ___tcaId = value;
    __uninitialized = false;
  }

  public void tcaId (notifications.AlarmTypeQualifier_T discriminator, notifications.TCAId_T value)
  {
    verifytcaId (discriminator);
    __discriminator = discriminator;
    ___tcaId = value;
    __uninitialized = false;
  }

  private void verifytcaId (notifications.AlarmTypeQualifier_T discriminator)
  {
    if (discriminator != notifications.AlarmTypeQualifier_T.TCA)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

} // class AlarmOrTCAIdentifier_T
