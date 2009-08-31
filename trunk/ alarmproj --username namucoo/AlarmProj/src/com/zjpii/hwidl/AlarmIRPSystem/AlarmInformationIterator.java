package AlarmIRPSystem;


/**
* AlarmIRPSystem/AlarmInformationIterator.java .
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
public interface AlarmInformationIterator extends AlarmInformationIteratorOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface AlarmInformationIterator
