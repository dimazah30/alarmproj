package AlarmIRPSystem;


/**
* AlarmIRPSystem/AlarmInformationIteratorPOA.java .
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
public abstract class AlarmInformationIteratorPOA extends org.omg.PortableServer.Servant
 implements AlarmIRPSystem.AlarmInformationIteratorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("next_alarmInformations", new java.lang.Integer (0));
    _methods.put ("destroy", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /*
        This method returns between 1 and "how_many" Alarm Informations. The
        IRPAgent may return less than "how_many" items even if there are more
        items to return. "how_many" must be non-zero. Return TRUE if there may
        be more Alarm Information to return. Return FALSE if there are no more
        Alarm Information to be returned.
        If FALSE is returned, the IRPAgent will automatically destroy the
        iterator.
        */
       case 0:  // AlarmIRPSystem/AlarmInformationIterator/next_alarmInformations
       {
         try {
           short how_many = in.read_ushort ();
           CosNotification.EventBatchHolder alarm_informations = new CosNotification.EventBatchHolder ();
           boolean $result = false;
           $result = this.next_alarmInformations (how_many, alarm_informations);
           out = $rh.createReply();
           out.write_boolean ($result);
           AlarmIRPConstDefs.AlarmInformationSeqHelper.write (out, alarm_informations.value);
         } catch (AlarmIRPSystem.NextAlarmInformations $ex) {
           out = $rh.createExceptionReply ();
           AlarmIRPSystem.NextAlarmInformationsHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /*
        This method destroys the iterator.
        */
       case 1:  // AlarmIRPSystem/AlarmInformationIterator/destroy
       {
         this.destroy ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/AlarmIRPSystem/AlarmInformationIterator:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public AlarmInformationIterator _this() 
  {
    return AlarmInformationIteratorHelper.narrow(
    super._this_object());
  }

  public AlarmInformationIterator _this(org.omg.CORBA.ORB orb) 
  {
    return AlarmInformationIteratorHelper.narrow(
    super._this_object(orb));
  }


} // class AlarmInformationIteratorPOA
