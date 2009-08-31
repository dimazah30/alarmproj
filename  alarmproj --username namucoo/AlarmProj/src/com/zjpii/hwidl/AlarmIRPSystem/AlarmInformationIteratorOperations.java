package AlarmIRPSystem;


/**
* AlarmIRPSystem/AlarmInformationIteratorOperations.java .
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
public interface AlarmInformationIteratorOperations 
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
  boolean next_alarmInformations (short how_many, CosNotification.EventBatchHolder alarm_informations) throws AlarmIRPSystem.NextAlarmInformations, ManagedGenericIRPSystem.InvalidParameter;

  /*
        This method destroys the iterator.
        */
  void destroy ();
} // interface AlarmInformationIteratorOperations
