package AlarmIRPSystem;


/**
* AlarmIRPSystem/_AlarmInformationIteratorStub.java .
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
public class _AlarmInformationIteratorStub extends org.omg.CORBA.portable.ObjectImpl implements AlarmIRPSystem.AlarmInformationIterator
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
  public boolean next_alarmInformations (short how_many, CosNotification.EventBatchHolder alarm_informations) throws AlarmIRPSystem.NextAlarmInformations, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("next_alarmInformations", true);
                $out.write_ushort (how_many);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                alarm_informations.value = AlarmIRPConstDefs.AlarmInformationSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/AlarmIRPSystem/NextAlarmInformations:1.0"))
                    throw AlarmIRPSystem.NextAlarmInformationsHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return next_alarmInformations (how_many, alarm_informations        );
            } finally {
                _releaseReply ($in);
            }
  } // next_alarmInformations


  /*
        This method destroys the iterator.
        */
  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/AlarmIRPSystem/AlarmInformationIterator:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _AlarmInformationIteratorStub
